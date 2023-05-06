package com.lec.java.inner01;

/*
 Inner Class(내부 클래스)
 1. Member inner class(멤버 내부 클래스): 다른 클래스 내부에서 선언된 클래스
 2. Static inner class(static 내부 클래스): 다른 클래스의 내부에서 static으로 선언된 클래스
 3. Local class(지역 클래스)
   1) Local inner class(지역 내부 클래스): 메소드 내부에서 선언된 클래스
   2) Anonymous inner class(익명 내부 클래스): 이름이 없는 local class
*/

/*
	복습
	static은 인스턴스 없이 사용가능
	method area에 올라온다
	최초에 한번 만들어진다
*/

import java.util.Map;

public class Inner01Main {

	public static void main(String[] args) {
		System.out.println("Member Inner Class(멤버 내부 클래스)");

		// 외부 클래스 인스턴스 생성
		TestOuter out = new TestOuter(100);

		// 멤버 내부 클래스의 인스턴스 생성
		// 멤버 내부 클래스의 이름: [외부클래스 이름].[멤버 내부클래스 이름]
		// [외부클래스 이름].[내부클래스 이름] 참조변수 =
		//      [외부클래스 인스턴스].new 내부클래스 생성자();
		TestOuter.TestInner in = out.new TestInner(111);
		in.printValue();
//				✨✨여기서 사용
//		for (Map.Entry<Integer, String> m : hmap.entrySet()) {
//			System.out.println(m.getKey() + " : " + m.getValue());
//		}


		// 하나의 외부 클래스 인스턴스를 이용해서
		// 멤버 내부 클래스의 인스턴스는 ✨✨여러개✨✨를 생성할 수 있다.

		TestOuter.TestInner in2 = out.new TestInner(122);
		in2.printValue();

	} // end main()

} // end class Inner01Main

















