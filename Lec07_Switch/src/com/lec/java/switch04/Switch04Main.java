package com.lec.java.switch04;

public class Switch04Main {

	public static void main(String[] args) {
		System.out.println("String 타입을 switch에서 사용하기");

		String language = "C++";

		switch (language){
			case "Java" -> System.out.println("Hello Java!");
			case "C++" -> System.out.println("Hello C++");
			case "Swift" -> System.out.println("Hello Swift");
		}

		// 동일한 코드
		switch (language){
			case "Java" :
				System.out.println("Hello Java!");
				break;
			case "C++" :
				System.out.println("Hello C++");
				break;
			case "Swift":
				System.out.println("Hello Swift");
				break;
		}



		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









