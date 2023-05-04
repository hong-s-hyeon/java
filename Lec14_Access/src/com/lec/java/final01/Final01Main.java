package com.lec.java.final01;

public class Final01Main {

	// final 필드 (멤버변수)
	// (주의) final 멤버 변수는 반드시 선언과 동시에 초기화 ( 혹은 생성자에서 초기화) 해야 한다
	final int NUM1 = 1;
//	final int NUM2; // 에러 : 왜? 선언과 동시에 초기화해야되~
final int NUM3;
	private int num4;

	public Final01Main(){
//		NUM1 = 10;
		NUM3 = 20;
	}

	public Final01Main(int num3) {
		this.NUM3 = num3;
	}

	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		//
//		System.out.println(NUM1);

		Final01Main f1 = new Final01Main();
		Final01Main f2 = new Final01Main(5);

		System.out.println(f1.NUM1);
		System.out.println(f1.NUM3);

		System.out.println(f2.NUM1);
		System.out.println(f2.NUM3);
	} // end main()


} // end class Final01Main










