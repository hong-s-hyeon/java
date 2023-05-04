package com.lec.java.db03;

import com.lec.java.db.Query;

import java.sql.*;

// 공통적으로 사용하는 상수들 인터페이스에 담아서 처리.
public class DB03Main implements Query {

	public static void main(String[] args) {
		System.out.println("DB 3 - PreparedStatement");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println(SQL_INSERT);
		System.out.println(SQL_SELECT_ALL);
		System.out.println(SQL_UPDATE_REGDATE);
		System.out.println(SQL_DELETE_BY_NO);

		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 클래스 로딩 성공");

			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB Connectino 성공");
			
			// PreparedStatement 인스턴스 생성
			System.out.println();
			System.out.println("INSERT");
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt(1, 10);   // setXXX(paramIndex, value) 로 ? 를 세팅.  첫번째 index 는 1
			pstmt.setString(2, "아이언맨");  // 두번째 ?
			pstmt.setString(3, "2001-10-10 13:22:28");   // 세번째 ?

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) INSERT 성공");

			pstmt.setInt(1, 20);   // setXXX(paramIndex, value) 로 ? 를 세팅.  첫번째 index 는 1
			pstmt.setString(2, "캡틴");  // 두번째 ?
			pstmt.setString(3, "2022-04-02 09:22:33");   // 세번째 ?

			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) INSERT 성공");

			pstmt.close();

			// UPDATE();
			System.out.println();
			System.out.println("UPDATE");
			pstmt = conn.prepareStatement(SQL_UPDATE_REGDATE);
			pstmt.setString(1, "2021-08-16");
			pstmt.setInt(2, 10);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 row(행) UPDATE 성공");

			pstmt.close();

			// SELECT -> executeQuery()
			System.out.println();
			System.out.println("SELECT");
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				String no = rs.getString(COL_LABEL_NO);
				String name = rs.getString(COL_LABEL_NAME);
				String regDate = rs.getString(COL_LABEL_REGDATE);
				String result = no + "\t | " + name + "\t | " + regDate;
				System.out.println(result);
			}


		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally{

			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}


	} // end main()

} // end class DB03Main






















