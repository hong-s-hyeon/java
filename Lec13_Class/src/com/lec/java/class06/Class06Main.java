package com.lec.java.class06;

public class Class06Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습 : 성적처리");

		// TODO
		Score score = new Score("홍승현",100, 100, 100);
		System.out.println(score.calcTotal());
		System.out.println(score.calcAvg());
		score.displayInfo();

		System.out.println("프로그램 종료");
	} // end main()

} // end class Clas06Main










