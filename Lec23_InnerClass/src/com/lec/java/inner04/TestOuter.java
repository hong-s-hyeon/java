package com.lec.java.inner04;

public class TestOuter {

	// 멤버변수
	private int value;  // 인스턴스 변수
	public static int count = 100; // 클래스 변수 (static)

	// 생성자
	public TestOuter(int value) {
		this.value = value;
	}

	// static inner class (nested class)
	public static class TestNested{

		public void printValue(){

			// static 안에서는 non-static을 사용 못해
//			System.out.println("value = " + value);
			System.out.println("count = " + count);

		}

		public static void println(){
			System.out.println("println() count = " + count);
		}

	} // end inner

} // end class TestOuter


// TestOuter: 외부 클래스(outer class, enclosing class)
// TestNested: 중첩 클래스(nested class, static inner class)








