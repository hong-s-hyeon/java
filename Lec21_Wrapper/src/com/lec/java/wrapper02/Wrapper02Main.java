package com.lec.java.wrapper02;

/* Java 5부터 wrapper 클래스의 auto-boxing/unboxing 기능 제공
 * 	boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
 * 	unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
 */
public class Wrapper02Main {

	public static void main(String[] args) {
		System.out.println("auto-boxing, auto-unboxing");

		Integer num1 = 10;   // Integer.valueOf(10);   // auto-boxing
		Integer num2 = 20;
		Integer num3 = num1 + num2;
		// unboxing        unboxing
		Integer num30 = Integer.valueOf(num1.intValue() + num2.intValue());

		System.out.println("num3 = " + num3);

		System.out.println();
		System.out.println("boxing/unboxing");
		// boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
		// unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것

		Integer num4 = Integer.valueOf(100);     // boxing
		int n4 = num4.intValue();                    // unboxing

		System.out.println();
		System.out.println("auto-boxing/auto-unboxing");

		Integer num5 = 100;  // auto-boxing
		int n5 = num5;       // auto-unboxing

		System.out.println();
		System.out.println("wrapper 클래스들");

		Long num100 = Long.valueOf(10000000000L);    //기본자료형을 wrapper 클래스에 저장하는 작업: boxing

		Double num200 = 3.14;        //auto-boxing : 값을 알아서 박싱해주는것

		int n300 = num200.intValue();
		System.out.println("n300의 값은  "+ n300);

		// 주의!
//		Wrapper 클래스는 == 와 같은 비교연산시 한쪽이 primitive type 이면 auto-unboxing 하여 비교 하나
//				비교연산자의 양쪽이 wrapper 인 경우는 주소값으로 비교한다.
//				x 와 y 는 각각 달리 생성된 객체이므로 다른 주소값을 가진다. wrapper 끼리의 비교를 해야 한다면 equals() 를 사용해야 한다
		System.out.println(num1 == 10);    // 10 == 10
											// num1 >> unboxing
											// primitive == primitive 비교
		System.out.println(num2);
		System.out.println(num1 == num2);  // num1 의 주소 == num2 의 주소


		System.out.println("\n프로그램 종료");
	} // end main()

} // end class















