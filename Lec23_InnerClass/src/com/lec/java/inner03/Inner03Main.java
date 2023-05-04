package com.lec.java.inner03;

public class Inner03Main {

	public static void main(String[] args) {
		System.out.println("외부/내부 클래스의 this");

		TestOuter out = new TestOuter(100);
		TestOuter.TestInner in1 = out.new TestInner(200);
		in1.printValue(300);

		System.out.println();

		in1.printValue(333);

		TestOuter.TestInner in2, in3;
		in2 = out.new TestInner(222);
		in2.printValue(444);
		in3 = new TestOuter(111).new TestInner(250);
		in3.printValue(555);


	} // end main()

} // end class Inner03Main

















