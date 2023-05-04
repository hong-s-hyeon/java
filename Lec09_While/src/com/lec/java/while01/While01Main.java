package com.lec.java.while01;

/*
 * while 순환문
 * 
 * [구문]
 * while(조건식) {
 *    ...
 * }
 * 
 * 조건식이 '참' (true) 인 동안 while 블럭 반복
 * 
 */
public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");

		int i = 1;  // 초기식
		while(i <= 10){  // 조건식
			System.out.println(i);
			i++;  // 증감식
		}
		//	 증감이 끝나고나면 i=???
		System.out.println("i = " + i);
		System.out.println();

		i = 10;
		while(i >= 1){
			System.out.println(i);
			i--;
		}
		// 증감이 끝나고나면 i=???
		System.out.println("i = " + i);

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class While01Main









