package com.lec.java.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
JDBC (Java DataBase Connectivity) 사용
  1) 프로젝트 폴더에 라이브리리 폴더를 생성 (ex: lib)
  2) MySQL 용 드라이버 다운로드
     mysql-connector-j-8.x.x.jar
     https://mvnrepository.com/artifact/mysql/mysql-connector-java
  3) 위 라이브러리를 라이브러리 폴더에 복사
  4) Project Structure 에서  Project Settings - Librararies 에 추가
  5) 라이브러리를 사용하는 사용하는 모듈 지정

 1. JDBC 연동을 위한 정보들(상수들)을 정의(세팅)
 2. JDBC 드라이버 클래스를 메모리에 로드
 3. DB와 connection(연결)을 맺음
 4. Statement 인스턴스를 생성 (SQL을 사용하기 위한 인스턴스)
 5. SQL 문장 작성(SELECT, INSERT, UPDATE, DELETE)
 6. SQL 문장을 DB 서버로 전송
 7. 실행 결과 확인
 8. 리소스 해제
*/

// er-diagram 만들기
// http://ermaster.sourceforge.net/update-site


public class DB01Main {

	// 1. JDBC 연동을 위한 정보들(상수들)을 정의(세팅)
	// JDBC 드라이버 클래스 정보
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	// 접속할 DB 서버 정보
	public static final String URL = "jdbc:mysql://localhost/mydb2211";

	// 접속할 사용자 계정 정보
	public static final String USER = "myuser2211";
	public static final String PASSWD = "1234";
		
	public static void main(String[] args) {
		System.out.println("DB 1 : JDBC 프로그래밍");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;


		try {
			// 2. JDBC 드라이버 클래스를 메모리에 로드
			Class.forName(DRIVER);    // <-- 동적 클래스 로딩.
			System.out.println("드라이버 클래스 로딩 성공");

			//  3. DB와 connection(연결)을 맺음
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB Connect 성공");
			
			// 4. Statement 인스턴스를 생성 (SQL을 사용하기 위한 인스턴스)
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");

			// 5. SQL 문장 작성(SELECT, INSERT, UPDATE, DELETE)
			System.out.println();
			String sql_insert = "INSERT INTO test_member VALUES(100, '마징가', now())";
			System.out.println(sql_insert);

			// 6. SQL 문장을 실행 (DML)
			int cnt = stmt.executeUpdate(sql_insert); // 'DML' 의 경우 executeUpdate() 로 실행
														// 리턴값은 정수(int)
			System.out.println(cnt + "개 row(행)이 INSERT 됨");

			System.out.println();
			String sql_select = "SELECT * FROM test_member";
			System.out.println(sql_select);

			// 6. SQL 문장 실행 (SELECT)
			rs = stmt.executeQuery(sql_select);// 'SELECT 및 기타쿼리' 의 경우 executeQuery() 로 실행
												// 리턴값은 ResultSet 객체

			// 7. ResultSet 에서 result 데이터 확인

			// 7-1 컬럼 이름으로 받기
//			System.out.println();
//			while(rs.next()){ // next() 레코드 하나 추출하고 true 리턴. 추출할 레코드 없으면 false 리턴
//				String no = rs.getString("mb_no");   // getXXXX() 에 '컬럼명 혹은 별명' 명시
//				String name = rs.getString("mb_name");
//				String regDate = rs.getString("mb_regDate");
//				String result = no + "\t | " + name + "\t | " + regDate;
//				System.out.println(result);
//			}

			// 7-2 컬럼 인덱스로 받기
//			System.out.println();
//			while(rs.next()){ // next() 레코드 하나 추출하고 true 리턴. 추출할 레코드 없으면 false 리턴
//				String no = rs.getString(1);   // getXXXX() 에 컬럼 인덱스 명시
//				String name = rs.getString(2);
//				String regDate = rs.getString(3);
//				String result = no + "\t | " + name + "\t | " + regDate;
//				System.out.println(result);
//			}

			// 7-3 NULL 처리해주기
			// SQL 데이터가 NULL 이면 getString 은 null 리턴
//			System.out.println();
//			while(rs.next()){ // next() 레코드 하나 추출하고 true 리턴. 추출할 레코드 없으면 false 리턴
//				String no = rs.getString("mb_no");   // getXXXX() 에 '컬럼명 혹은 별명' 명시
//				if(no == null) no = "";
//				String name = rs.getString("mb_name");
//				if(name == null) name = "";
//				String regDate = rs.getString("mb_regDate");
//				if(regDate == null) regDate = "";
//				String result = no + "\t | " + name + "\t | " + regDate;
//				System.out.println(result);
//			}

			// 7-4 개별적인 타입으로 get 하기
			System.out.println();
			while(rs.next()){
				int no = rs.getInt("mb_no");   // SQL NULL 의 경우 0을 리턴
				String name = rs.getString("mb_name");
				if(name == null) name = "";

				LocalDateTime localDateTime = null;
				localDateTime = rs.getObject("mb_regDate", LocalDateTime.class);

				String regDate = "";
				if(localDateTime != null){
					regDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
				}

				String result = no + "\t | " + name + "\t | " + regDate;
				System.out.println(result);
			}



		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			// 8. 리소스 해제
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}


		System.out.println("프로그램 종료");
	} // end main()

} // end class DB01Main













