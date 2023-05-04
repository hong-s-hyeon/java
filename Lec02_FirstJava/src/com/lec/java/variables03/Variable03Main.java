package com.lec.java.variables03;
/*
        모든 자바프로그램은 main()  메소드부터 '시작'한다.
        프로그램 실행순서는 main() 의 첫 문장(statement)부터 차례대로 실행
        문장의 끝은 반드시 세미콜론 ';' 으로 마무리 되어야 한다
        main() 의 마지막 문장까지 실행 마무리 되면 자바프로그램 종료
*/

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float(4바이트), double(8바이트)
//문자 타입: char(2바이트)
//논리 타입: boolean(1바이트)


public class Variable03Main {
    public static void main(String[] args) {
        // byte >> -128 ~ 127  >> 2^8
        System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        byte num1 = -128;
        byte num2 = 0;
        byte num3 = 123;
//        byte num4 = 1234; // Incompatible types. Found: 'int', required: 'byte'
//        byte type = int type      이란 말인가?

        // short >> 2^16
        System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        short num5 = -12345;
        short num6 = 12345;
//        short num7 = 32768; // Incompatible types. Found: 'int', required: 'short'

        // int >> 42억 수준
        System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
//        int num9 = 9876543210; // Integer number too large >> 그래도 납득
//            int    literal int

        // long >> 무지막지...
        System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
//        long num10 = 9876543210; // Integer number too large ????????
//          long       literal > int

        // 리터럴(literal) : 코드에 직접 입력하는 값.
        // 리터럴도 타입이 있다.
        // 정수타입리터럴은 int 타입으로 인식하려 한다.
        // 실수타입리터럴은 double 타입으로 인식하려 한다.

        long num11 = 9876543210L;
        // 9876543210 이라는 숫자가 int 타입이 아니라 long 타입임을 명시하기 위해서
        // 숫자 뒤에 영문자 L을 붙여줌
        // 자바에서 정수 타입 변수의 기본은 int임.
        // 자바는 정수 숫자(리터럴)를 별도 표기가 없으면 int라고 생각.

        long num12 = 12;
//       long type    int type(literal)   >>> 큰 타입(8byte)에 작은 타입(4byte)을 대입하는 것은 가능
//        long num13 = 12l;
//       long type    long type(literal)
        int num14 = 12;
//       int type    int type(literal)
//        int num15 = 12l;
//       int type    long type(literal)  >>> 작은 타입(4byte)에 큰 타입(8byte)을 대입하는 것은 불가능

        // 값의 경계선을 넘어가면?
        // overflow! 1 2 3 4 5 ... 126 127 -128 -127 ...
        // 반대의 경우? underflow! -1 -2 -3 ... -126 -127 -128 127 126 ...
        byte num15 = Byte.MAX_VALUE;
        byte num16 = (byte)(num15 + 1); // 128???
        System.out.println("num15 : " + num15);
        System.out.println("num16 : " + num16);

        // 용량은? 초등학교 학년을 정하는데 있어서 한 학년에 20학급 존재. 이걸 int? byte로도 충분한데 3byte를 낭비...
        // 나중에 처리속도에 영향을 줄 수도 있음


    }// end main
}
