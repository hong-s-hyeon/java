package com.lec.java.static03;

import java.util.Calendar;

/*
 *  Singleton 디자인
 * 	인스턴스가 최대 1개까지만 생성되어야 하는 디자인 패턴
 */
public class Static03Main {

	public static void main(String[] args) {
		System.out.println("Singleton 디자인 패턴");

//		new 생성자 메소드가 private이므로~
//		Test t1 = new Test();
//		Test t2 = new Test();

		Test t1 = Test.getInstance();
		System.out.println("t1:num = " + t1.getNum());
		t1.setNum(123);
		System.out.println("t1:num = " + t1.getNum());

		System.out.println();

		Test t2 = Test.getInstance();
		t2.setNum(12345);
		System.out.println("t1:num = " + t1.getNum());
		System.out.println("t2:num = " + t2.getNum());

		// 주소
		System.out.println(t1);    // com.lec.java.static03.Test@4dd8dc3
		System.out.println(t2);    // com.lec.java.static03.Test@4dd8dc3


		// 생성자 제공 없이 Singleton 으로 설계된 예
		Calendar calendar = Calendar.getInstance();		// 아~ 이거 싱글톤이구나?


	} // end main()

} // end class Static03Main











