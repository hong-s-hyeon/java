package com.lec.java.access01;


// 접근권한 수식어(Access Modifier)  접근제한자
// 1) 종류: private, (default), protected, public 
// 2) 기능 
//   - 멤버 변수, 멤버메소드에 대한 접근 권한을 제한

// 3) private: '자기자신'이 선언된 클래스에서만 사용 가능
// 4) (default): '자기자신' + '같은 패키지'에 있는 클래스들에서는사용 가능
// 5) protected: '자기자신' + '같은 패키지' + '상속받은 클래스' 에서 사용 가능
//         다른 패키지의 클래스라도 '상속 받으면' 사용 가능하다                     
// 6) public: 어디서든 사용이 가능

// 사용범위: private < (default) < protected < public

//※ 클래스에 붙는 접근제한자는 딱 두가지 입니다
// (default) , public

import com.lec.java.access02.Test02;


public class Access01Main {

	public static void main(String[] args){
		System.out.println("접근권한 수식어(Access Modifier)");

		Test01 t1 = new Test01();

//		t1.privateNum = 10;		// 자기 클래스					// x
		t1.defaultNum = 10;		// 자기 클래스, 같은 패키지		// x o
		t1.protectedNum = 10;	// 자기 클래스, 같은 패키지, 상속	// x o
		t1.publicNum = 10;		// 어디에서나					// o


		// 다른 패키지(com.lec.java.access02) 에 있는 클래스
		// 일단 다른 패키지 라면 import 부터 선행되어야 한다
		Test02 t2 = new Test02();

//		t2.privateNum = 10;		// 자기 클래스					// x
//		t2.defaultNum = 10;		// 자기 클래스, 같은 패키지		// x
//		t2.protectedNum = 10;	// 자기 클래스, 같은 패키지, 상속	// x
		t2.publicNum = 10;		// 어디에서나					// o


	} // end main()

} // end class Access01Main










