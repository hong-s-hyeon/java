package com.lec.java.inner08;

public class Anonymous02Main {

	public static void main(String[] args) {
		System.out.println("익명 내부 클래스 활용");

		System.out.println("1. 익명 클래스를 사용하지 않는 경우");
		Calculable tc1 = new TestMyMath();    // 다형성
		System.out.println("result = " + tc1.operate(1.0, 2.0));


		System.out.println();
		System.out.println("2. 익명 클래스를 사용하는 경우");
		tc1 = new Calculable() {
			@Override
			public double operate(double x, double y) {
				return x + y;
			}
		};
		System.out.println("result = " + tc1.operate(1.0, 2.0));


		// 도전]
		// operate() 가 x - y 를
		// operate() 가 x * y 를
		// operate() 가 x / y 를
		// 리턴하는 익명클래스를 각각 만들고 실행해보세요 (결과 출력)
		System.out.println("x - y");
		double a = new Calculable() {
			@Override
			public double operate(double x, double y) {
				return x - y;
			}
		}.operate(100, 50);
		System.out.println(a);

		System.out.println();
		System.out.println("x * y");
		System.out.println( new Calculable() {
			@Override
			public double operate(double x, double y) {
				return x * y;
			}
		}.operate(15, 10));

		System.out.println();
		System.out.println("x / y");
		Calculable c = new Calculable() {
			@Override
			public double operate(double x, double y) {
				return x / y;
			}
		};
		System.out.println(c.operate(1500, 10));


	} // end main()

} // end class Anonymous02Main

class TestMyMath implements Calculable{

	@Override
	public double operate(double x, double y) {
		return x + y;
	}
}















