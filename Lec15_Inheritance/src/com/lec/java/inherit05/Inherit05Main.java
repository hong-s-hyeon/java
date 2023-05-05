package com.lec.java.inherit05;


/* 상속과 접근권한
 * private: 자기 클래스에서만 사용 가능
 * default: 자기 글래스 + 같은 패키지 안에서 사용 가능
 * protected: 자기 글래스 + 같은 패키지 + '상속 클래스'에서 사용 가능 ★
 * public: 어디서나 직접 사용 가능
 */

import com.lec.java.inherit06.Test02;
import com.lec.java.inherit06.Test03;
import com.lec.java.inherit06.test.Test04;

public class Inherit05Main {

	public static void main(String[] args) {
		System.out.println("상속: 접근 권한(제어)");

		// TODO
		Test01 t1 = new Test01();
		Test02 t2 = new Test02();
		Test03 t3 = new Test03();
		Test04 t4 = new Test04();

		t1.showInfo();
		System.out.println();
		t2.showInfo();
		System.out.println();
		t3.showInfo();
		System.out.println();
		t4.showInfo();


		System.out.println("\n프로그램 종료");
	} // end main()
} // end class











