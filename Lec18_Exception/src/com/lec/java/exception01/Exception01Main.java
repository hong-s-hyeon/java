package com.lec.java.exception01;

import java.util.Scanner;

/* 예외(Exception)
	
	컴파일 에러 : 문법상 오류
	예외(Exception) : 문법상의 오류 가 아닌 '실행중' 에 발생되는 오류상황
	  
	(기본적으로) 예외 가 발생되면, 예외 관련 메세지 출력하고 프로그램이 종료 됩니다.  
 */
public class Exception01Main {

	public static void main(String[] args) {
		System.out.println("예외(Exception)");
		
		System.out.println("[1] ArithmeticException");
		int num1 = 123;
		int num2 = 0;

//		System.out.println("num1 / num2 = " + (num1 / num2)); //  / by zero
		// Exception01Main.java:21

		System.out.println("[2] ArrayIndexOutOfBoundsException");
		int[] numbers = new int[10];

//		numbers[10] = 100; // Index 10 out of bounds for length 10
		// Exception01Main.java:27

		System.out.println("[3] NegativeArraySizeException");
		int size = -1;
		
//		int [] numbers2 = new int[size]; // -1
		// Exception01Main.java:33
		
		System.out.println("[4] NullPointerException(NPE)");
		String str = null;

//		System.out.println("문자열 길이: " + str.length()); null.~~~~ >> 이거 전부 NPE
		// Cannot invoke "String.length()" because "str" is null
		// Exception01Main.java:39
		System.out.println("[5] InputMismatchException");  
		Scanner sc = new Scanner(System.in);
	
		sc.nextInt(); // << 정수가 아닌 다른것 넣으면~ exception 발생
		// Exception01Main.java:45
		sc.close();
		
		System.out.println("\n프로그램 정상 종료");
	} // end main()

} // enc class Exception01Main











