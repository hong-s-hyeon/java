package com.lec.java.operator08;

/* 비트 연산자 (bit-wise operator)
 *   a & b: (and) a,b가 모두 1 이면 결과도 1, 그 외에는 0
 *   a | b: (or) a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
 *   a ^ b: (xor) a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
 *          결국 둘이 같으면 0, 다르면 1
 *    ~a  : (not) a가 1이면 0, a가 0이면 1로 바꿔줌
 *
 *   ★ 비트연산자의 피연산자는 정수!  (논리연산자와 다르다!)
*/
public class Operator08Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");

		byte n1 = 10;  // -> 0b1010;
		byte n2 = 7;   // -> 0b0111;
		int result = n1 & n2;
		System.out.println("& 결과 = " + result);
		System.out.println("& 결과 = " + Integer.toBinaryString(result));
		/*
		 *   0000 1010  n1
		 *   0000 0111  n2
		 *   ---------- &
		 *   0000 0010
		 */

		result = n1 | n2;
		System.out.println("| 결과 = " + result);
		System.out.println("| 결과 = " + Integer.toBinaryString(result));

		// 디버그

		/*
		 *   0000 1010  n1
		 *   0000 0111  n2
		 *   ---------- |
		 *   0000 1111
		 */

		result = n1 ^ n2;
		System.out.println("^ 결과 = " + result);
		System.out.println("^ 결과 = " + Integer.toBinaryString(result));
		/*
		 *   0000 1010  n1
		 *   0000 0111  n2
		 *   ---------- ^
		 *   0000 1101  13
		 */

		result = ~n1;
		System.out.println("~ 결과 = " + result);
		System.out.println("~ 결과 = " + Integer.toBinaryString(result));

		// 음수 정수 표현 참조 : http://tcpschool.com/c/c_refer_negativeNumber
		
		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");
		int n3 = 10;
		int result2 = n3 >> 1;
		System.out.println(">> 결과(10진수): " + result2);
		System.out.println(">> 결과(2진수): " + Integer.toBinaryString(result2));

		// 0000 1010  :10
		// ↘↘↘↘ ↘↘↘↘
		// 0000 0101  :5

		result2 = n3 << 1;
		System.out.println(">> 결과(10진수): " + result2);
		System.out.println(">> 결과(2진수): " + Integer.toBinaryString(result2));

		// 4 * 2
		// 4 << 1


		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class


//Debug (디버깅)
//step1 : breakpoint 설정
//step2 : debug 시작
//step3 :
//     step over
//     resume

//    1) 프로그램의 흐름
//    2) 변수값의 변화
//    3) 호출관계 흐름

//step4 : debug 종료 (terminate)
//





