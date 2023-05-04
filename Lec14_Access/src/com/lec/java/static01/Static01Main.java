package com.lec.java.static01;

import java.util.Scanner;

// 클래스에 선언된 멤버 변수/멤버 메소드는
// static 여부에 따라 아래와 같이 불려진다

// 인스턴스 변수: 
//   static 이 안붙은 변수
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 변수
// 인스턴스 메소드:
//   static 이 안 붙은 메소드
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 메소드

// 클래스 변수(static 변수):
//   클래스의 멤버 변수들 중에서,
//   인스턴스를 생성하지 않아도 사용할 수 있는 변수
// 클래스 메소드(static 메소드):
//   인스턴스를 생성하지 않아도 사용할 수 있는 메소드


public class Static01Main {

	static Scanner sc = new Scanner(System.in);

	public static void test(){}

	public void test2(){}

	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드 vs 클래스 변수/메소드");

		// static 안에서는 non-static을 사용 할 수 없다!!! main은 static붙엇지?
		sc.nextInt();
		// field에 static access 안붙이면 나는 에러
		// Non-static field 'sc' cannot be referenced from a static context

		test();  // 얘는 static 메소드니까 가능하지~

		// instance 변수/ 메소드
		// 인스턴스가 생성된 후에 사용 가능하다는 것!!!!!! 위의 test2()
		Static01Main tc = new Static01Main();
		tc.test2();  // 얘는 ok

//		test2(); // Non-static method 'test2()' cannot be referenced from a static context


	} // end main()

} // end class Static01Main











