package com.lec.java.for02;

public class For02Main {

	public static void main(String[] args) {
		System.out.println("For문 - 구구단 출력");

//		구구단 2단
//		2 x 1 = 2
//		2 x 2 = 4
//		2 x 3 = 6
//		2 x 4 = 8
//		2 x 5 = 10
//		2 x 6 = 12
//		2 x 7 = 14
//		2 x 8 = 16
//		2 x 9 = 18

		for(int i = 1; i < 10; i++){
			System.out.printf("2 x %d = %d\n", i, (2 * i));
		}

//		구구단 2 단부터 9 단까지
		int front;
		int back;
		for(front = 2; front <= 9; front++){
			for(back = 1; back <= 9; back ++){
				System.out.printf("%d x %d = %d\n", front, back, (front * back));
			}
		}


	} // end main()

} // end class For02Main












