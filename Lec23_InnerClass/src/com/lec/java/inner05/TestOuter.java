package com.lec.java.inner05;

public class TestOuter {
	// TestOuter 클래스의 멤버 변수
	private int num1 = 100;

	// TestOuter 클래스의 멤버 메소드
	public void localMethod() {

		int num2 = 200;   // 메소드의 지역변수

		class TestLocal {    // Local inner class

			private int num3 = 300;


			public void showNumbers(){
				// 외부 클래스의 맴버
				System.out.println("num1 = " + num1);

				// 지역클래스와 동일한 scope 의 지역변수
				// 이 경우! effective final 인 지역변수만 사용 가능.
				System.out.println("num2 = " + num2);

				// 지역클래스의 멤버변수
				System.out.println("num3 = " + num3);
			}
		} //end inner

		// 메소드안에서 정의된 class 이므로 인스턴스 생성부터 필요한것 호출까지 해주어야 한다.
		TestLocal local = new TestLocal();
		// 위의 TestLocal 타입의 local은 메소드가 끝나면 같이 사라짐

		//num2 = 400;  // num2 값을 변경하면.. 아래 showNumbers()에선
		// 200 이 찍혀야 하나? 400이 찍혀야 하나?
		// 그래서 로컬내부클래스에서 사용 가능한 지역의 변수는
		// 반드시 effectively final 이어야 한다
		// 	  즉 한번 초기화 된후 값이 변경되지 않거나, final 이어야 한다.
		local.showNumbers();
		System.out.println(local.num3);

	} // end localMethod

} // end class TestOuter













