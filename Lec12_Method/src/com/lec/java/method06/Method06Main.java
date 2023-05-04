package com.lec.java.method06;

/* Method Overloading (메소드 중복 정의)
	 같은 이름으로 메소드를 매개변수 리스트를 달리하여 중복 정의, 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 

 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");

		sayHello();
		sayHello("홍승현");
		sayHello(30);
		sayHello("홍승현", 20);
//		sayHello("소정", "승현");
		sayHello('a');  //  >> 왜 에러 아냐~?! char > int 자동형변환 된다~!
		byte a = 10;
		sayHello(a); // >>> byte > int 자동 형변환


		//메소드 오버로딩의 장점
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("hello");
		System.out.println("hello" + ", hi");


		System.out.println("\n프로그램 종료");
	} // end main()

	// 1
	public static void sayHello(){
		System.out.println("sayHello() 호출");
		System.out.println("안녕하세요~");
	}

//	public static int sayHello(){
	// 해당 메소드의 signiture는 sayHello() 이다. 즉, 리턴타입은 의미없다
//		return 0;
//	}

	// 2
	public static void sayHello(String name){
		// 해당 메소드의 signiture >> sayHello(String)
		System.out.println("sayHello(String) 호출");
		System.out.println("안녕하세요~");
		System.out.println("이름은 " + name + "입니다");
	}

	// 3
	public static void sayHello(int age){
		//signiture >> sayHello(int)
		System.out.println("sayHello(int) 호출");
		System.out.println("나이는 " + age + "입니다");
	}

	// 4
	public static void sayHello(String name, int age){
		// signiture >> sayHello(String, int)
		System.out.println("sayHello(String, int) 호출");
		System.out.println("헬로우~");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);

	}

	// 5
	public static void sayHello(int age, String name){
		// signiture >> sayHello(int, String)   // 순서가 달라져도 signiture는 달라지고 overloading이 된다!
		System.out.println("sayHello(String, int) 호출");
		System.out.println("헬로우~");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);

	}

} // end class









