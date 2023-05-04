package com.lec.java.static02;

//클래스 변수 / 메소드 특징 (static)
//1. 메모리의 '메소드 영역'에 클래스가 로드 될때(프로그램 시작될때) '한번만' 생긴다
//2. 인스턴스가 생성되지 않아도 사용할 수 있다.
//		- 클래스이름.static변수,  클래스이름.static메소드()  <-- 요렇게 사용한다
//3. 모든 인스턴스는 하나의 static 변수/메소드를 '공유'한다.


public class Static02Main {

	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드");

		Test.show2();    // 0으로 초기화 되어있다~
		Test.sNum = 123;
		Test.show2();

		System.out.println();

		//instance variable 이므로~
//		Test.num = 10; >> 무조건 instance 생성 후, instance.num으로 접근 가능

		Test t = new Test();
		t.num = 10;
		t.show();

		Test t2 = new Test();
		t2.show();

		System.out.println();
		Test.sNum = 987;
		t.show();
		t2.show();

		System.out.println("instance에서 static 변수 변경 가능?");
		// 인스턴스 변수로도 static 멤버 사용이 가능하긴 하나...
		// 바람직한 방법은 아니다..
		// 바람직한 방법은?~! >>>> 클래스명.static변수
		t2.sNum = 340;
		t.show();
		t2.show();

		System.out.println();
		Test.sNum = 100;
		t.sNum = 500;
		t2.sNum = 700;

		System.out.println(Test.sNum);
		System.out.println(t.sNum);
		System.out.println(t2.sNum);


	} // end main()

} // end class Static02Main







