package com.lec.java.exception06;

/* throws
	 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우:
	 메소드 이름 뒤에 throws Exception을 추가하면,
	 예외가 발생한 경우에는 메소드를 호출한 곳으로 exception이 던져짐.
	 'Exception' 및 이를 '직접 상속받은' Exception 을 throws 하는 메소드의 경우,
	 이 메소를 호출하는 쪽에서 반.드.시 예외 처리 (handling) 해야 한다. 안하면 에러!
	 
	 
	반면 'RuntimeException' 및 이를 상속받은 예외를 throws 하는 메소드는
	굳이 호출하는 쪽에서 매번 예외 처리 할 필요는 없다

 */
public class Exception06Main {

	public static void main(String[] args) /*throws Exception*/ {
		System.out.println("throws");

		System.out.println();
		TestClass test = new TestClass();
		int result = test.divide(123, 0); // 호출
		System.out.println("result = " + result);

//		Point!✨
//		printStackTrace()
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.lec.java.exception06.TestClass.divide(TestClass.java:11)
//		at com.lec.java.exception06.Exception06Main.main(Exception06Main.java:22)
		//설명
		// TestClass.divide 예외발생 but 예외 처리를 하지 않았어~ 넘겨~
		// "main" java.lang.ArithmeticException: / by zero 여기서 예외처리 안했어 ~ 넘겨~
		// 어디로 넘겨? java JVM ! 여기로 넘어온 예외가 있으면 JVM은 프로그램을 종료시킨다.

		// 예외 처리 1번✔️
		// TestClass.divide()에서 예외 처리를 하고 온다면?
		// System.out.println("result = " + result);
		// 결과
		// / by zero
		// result = 0
		// main > TestClass + 예외 처리 > main : main은 결과만 받는다

		// 예외 처리 2번✔️
		// 만약, TestClass에서 예외 처리를 호출한 쪽(main)에 무조건 넘기고 싶다면?
		// throws Exception 사용
		// TestClass.divide2 >> public int divide2(int x, int y) throws Exception {...}

//		test.divide2(123, 102); // 얘 왜 에러? Unhandled exception: java.lang.Exception
//		✨✨✨✨ 메소드에서 호출한 쪽에서 예외처리하라고 throws Exception 썻자나~
//		그래서 에러가 난다.
//		이럴 땐, 무조건 호출한 쪽에서 try{}문으로 처리해주어야한다
		try{
			test.divide2(123, 102);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		// 예외처리 3번✔️
		// main도 처리 안해! 그러면 main Method에서도
		// public static void main(String[] args) throws Exception {...} 해주면 됨.
		// 이렇게 하면, main 메소드를 호출한 쪽은 JVM인데,
		// 자바가상머신이 예외를 처리하는 순서는?
		// 1 : getMessage 호출
		// 2 : 예외상황이 발생해서 전달되는 과정 출력
		// 3 : 프로그램 종료

		// 호출한 메소드에서 발생한 에러가 RuntimException 자손이고,
		// throws RuntimException 해준다면 굳이 main에서도 handling해주지 않아도 된다~
//		test.divide3(222, 0); // > 에러뜨고 죽네
		test.divide3(222, 111);  // > 그냥 넘어가네
		try{
			test.divide3(222, 0); // > 에러뜨고 죽네
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		// 그러나 Exception 집안이라면!
		// 호출한 메소드에서 throws 하면, 반드시 핸들링해주어야 한다.
		// 예시 : Thread.sleep(1000);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료...");

	} // end main()

} // end class Exception06Main












