package com.lec.java.access03;



// 클래스의 접근 권한 수식어: public, (default)
// 1. public class: 어디에서나 인스턴스 생성이 가능한 클래스
//   (주의) public 클래스의 이름은 .java 파일 이름과 반드시 같아야 함
// 2. (default) class: 같은 패키지에 있는 클래스들에서만 인스턴스 생성이 가능

import com.lec.java.access04.TestPublic2;
//import com.lec.java.access04.TestPublic;

// 다른패키지의 (default) 클래스는 import 할수 없다.
//import com.lec.java.access04.TestDefault2;
// error >> 'com.lec.java.access04.TestDefault2' is not public in 'com.lec.java.access04'. Cannot be accessed from outside package

public class Access03Main {

	public static void main(String[] args) {
		System.out.println("public, default 클래스");

		TestPublic t1 = new TestPublic();

		// 같은 패키지라면? default class 가능하다!
		TestDefault t2 = new TestDefault();

		// 다른 패키지에 있는 public 클래스
		//	---------패키지명---------.--클래스명-- 까지 입력
		// import com.lec.java.access.TestPublic2;
		TestPublic2 t3 = new TestPublic2();

		// 다른패키지의 (default) 클래스는 import 할수 없다.
//		TestDefault2 t4 = new TestDefault2();

		TestPublic t11; // >> 얘는 access03에 있는 것
		// 다른 패키지에 있는데, 같은 이름의 클래스가 있다면?
		// 패키지까지 쭉 써줘야 한다.
		com.lec.java.access04.TestPublic t12 = new com.lec.java.access04.TestPublic();


	} // end main()

} // end class Access05Main










