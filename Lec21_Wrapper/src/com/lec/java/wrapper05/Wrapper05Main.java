package com.lec.java.wrapper05;

/* Wrapper 클래스의 유용성
 * 1. Object 타입이 모~든 (심지어 primitive) 타입도 받을수 있다.
 * 2. Collection 과 같은 Generic 클래스에선
 *     primitive 타입을 담을수 없다. 그러나 ,Wrapper 를 통해 가능하다.
 * 			ex> Map<int, int> (x)
 * 				Map<Integer, Integer>  (o)
 *
 * 3. Wrapper 는 null 값 표현 가능✨✨✨ 왜? Object타입의 빈값은? >> null 이니까~~
 */
public class Wrapper05Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스의 유용성");

		Object[] objs = new Object[5];

		objs[0] = new A();        // 부모타입으로 자손타입 답을 수 있다. 다형성
		objs[1] = new A2();
		objs[2] = new B();
		objs[3] = 100;     // auto-boxing + Polymorphism(다형성)
		// 1단계) Integer <- 100 (auto-boxing)
		// 2단계) Object <- Integer (Polymorphism)

		System.out.println(objs[3]); // <<-- unboxing
//		System.out.println(objs[3] * 3);		// 이건 에러
		System.out.println((int)objs[3] * 3);

		System.out.println("\n프로그램 종료");
	} // end main()

	// TODO

} // end class

class A{}

class A2 extends A{}

class B{}














