package com.lec.java.if04;

/*  삼항 연산자 (ternary operator)
 * 	 (조건식) ? 선택1 : 선택2
 * 	 (조건식)이 true 이면 선택1이 선택되고,
 *   (조건식)이 false 이면 선택2가 선택됨.
 */
public class If04Main {

	public static void main(String[] args) {
		System.out.println("if 문과 삼항 연산자");

		int num1 = 141;
		int num2 = 163;
		int big;

		big = (num1 > num2)? num1 : num2;
		System.out.println("big : " + big);

		// 두 숫자의 차이값(difference)
		int diff = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("두 수의 차: " + diff);

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










