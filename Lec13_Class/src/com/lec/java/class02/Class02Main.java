package com.lec.java.class02;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");

		// Circle class에서 constructor를 주석처리해도 바로 아래에 것은 에러안남
		// 왜? default contructor 생성하기 때문에~
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);

		System.out.println();
		System.out.println(c1.calcPerimeter());
		System.out.println(c1.calcArea());

		System.out.println(c2.calcPerimeter());
		System.out.println(c2.calcArea());

		System.out.println();
		System.out.println("public field 접근해서 값을 변경하면>?");
		c1.radius = 10;
		System.out.println("c1 객체 : " + c1.calcPerimeter());
		System.out.println("c1 객체 : " + c1.calcArea());

		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main










