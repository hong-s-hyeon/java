package com.lec.java.wrapper01;

/* Wrapper 클래스: 기본 자료형(primitive type)의 데이터를 감싸는 클래스
 * 기본 자료형: boolean, char, byte, short, int, long, float, double
 * Wrapper: Boolean, Character, Byte, Short, Integer, Long, Float, Double
 *
 * Wrapper 클래스는 String 과 마찬가지로 immutable(불변) 이다.
 */

public class Wrapper01Main {

    public static void main(String[] args) {
        System.out.println("Wrapper 클래스");
        System.out.println("wrapper 클래스에 값을 저장하는 방법");
        System.out.println();

        Integer i1 = 100;     // Reference Type에 primitive 타입을 대입???
        i1 = i1 + 100;        // reference 가 산술연산?
        System.out.println("i1 = " + i1);
        // ★Wrapper 클래스는 마치 primitive 타입 처럼 동작한다!★


        // 1. 생성자 이용
        Integer num1 = new Integer(123); // 'Integer(int)' is deprecated and marked for removal. Java9부터~
        System.out.println("num1 = " + num1);

        // 2. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용
        Integer num2 = Integer.valueOf(123);
        System.out.println("num2 = " + num2);

        System.out.println("==");
        if (num1 == num2) System.out.println("==같다");
        else System.out.println("!=다르다");
        System.out.println();
        System.out.println("equals");
        if (num1.equals(num2)) System.out.println("==같다");
        else System.out.println("!=다르다");

        // 3. new Integer() VS Integer.valueOf()
        System.out.println();
        Integer num3 = new Integer(123);    // new 는 언제나 새로운 instance 생성
        Integer num4 = Integer.valueOf(123);    // valueOf() 는 Object를 cache 해둔다.(String constant pool과 비슷)
                                                    // 같은 literal로 생성하면 같은 Object
                                                    // 메모리 절약차원

        System.out.println("new Integer");
        if (num1 == num3) System.out.println("==같다");
        else System.out.println("!=다르다");

        System.out.println("Integer.valueOf");
        if (num2 == num4) System.out.println("==같다");
        else System.out.println("!=다르다");


        // 4. literal 상수로 생성
        System.out.println();
        Integer num5 = 123;
        // 내부적으로는 Integer.valueOf(123) 과 같다(Auto-Boxing)


        // 5. valueOf(문자열) 가능!
        System.out.println();
        Integer num6 = Integer.valueOf("123");


        // 6. 산술 연산 가능
        num6 *= 2;                      // Unboxing 발생
        System.out.println(num6);


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class
















