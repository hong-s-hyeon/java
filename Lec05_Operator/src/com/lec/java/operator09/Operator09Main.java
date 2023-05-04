package com.lec.java.operator09;
/* 산술 연산의 결과 타입
 * 
 * 일단 피연산자가 reference type 이면, unbox 후 형변환 수행됨. 그리고 나서
 * 피연산자중 하나라도 double 이면 다른쪽이 double 이 된다.  
 * 그렇지 않으면 피연산자중 하나라도 float 이면 다른 쪽이 float 가 된다.  
 * 그도 아니면 피연산자중 하나라도 long 이면 다른 쪽을 long 으로 바꾼다.  
 * 그도 아니면 양쪽 피연산자 모~ 두 int 로 바꾼다.
 * 
 * https://docs.oracle.com/javase/specs/#5.6.2
 * 	When an operator applies binary numeric promotion to a pair of operands, each of which must denote a value that is convertible to a numeric type, the following rules apply, in order, using widening conversion (§5.1.2) to convert operands as necessary: 
 * 	If any of the operands is of a reference type, unboxing conversion (§5.1.8) is performed. Then: 
 * 	If either operand is of type double, the other is converted to double. 
 * 	Otherwise, if either operand is of type float, the other is converted to float. 
 * 	Otherwise, if either operand is of type long, the other is converted to long. 
 * 	Otherwise, both operands are converted to type int.
 */
public class Operator09Main {

	public static void main(String[] args) {
		System.out.println("산술연산의 결과 타입");

		int n1 = 10, n2 = 20;
		int n3 = n1 + n2;  // int + int 연산의 결과는 int 다
		System.out.println("n3: " + n3);

		byte b1 = 100, b2 = 50;
//		byte b3 = b1 + b2;  // byte + byte -> int 다!  // Incompatible types. Found: 'int', required: 'byte'
		byte b3 = (byte)(b1 + b2);  // 명시적 형변환으로 가능
		System.out.println("b3 = " + b3);

		long l1 = 10L;
//		int n4 = n1 + l1;  // int + long -> long

		short s1 = 100;
//		short s2 = s1 + b1;   // short + byte -> int

		float f1 = 1.0f, f2 = 2.0f;
		float f3 = f1 + f2;  // float + float -> float

		double d1 = 1.0;
//		float f4 = f1 + d1;   // float + double -> double

		long l2 = 27000000000L;   // 3000 * 3000 * 3000
		System.out.println("l2: " + l2);

		// 4byte
		l2 = 3000 * 3000 * 3000;  // int 끼리 연산결과->int (오버플로 발생)
		System.out.println("l2: " + l2);

		System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);

		l2 = 3000L * 3000 * 3000;
		System.out.println("l2: " + l2);

		// 복합대입연산자의 경우 형변환 주의
		int sum = 0;
		double d3 = 1.2;
//		sum = sum + d3;
		sum += d3;  // ?? 에러 안난다?
		System.out.println("sum = " + sum);

		// sum += d3  복합 대입연산자는
		//    sum = sum + d3 이 아니라
		//    sum = (int)(sum + d3)  으로 동작하기 때문이다


		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class










