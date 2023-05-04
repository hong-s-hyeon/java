package com.lec.java.casting;
/*
        모든 자바프로그램은 main()  메소드부터 '시작'한다.
        프로그램 실행순서는 main() 의 첫 문장(statement)부터 차례대로 실행
        main() 의 마지막 문장까지 실행 마무리 되면 자바프로그램 종료
*/

/*
 * 암묵적 형변환(Implicit casting): 자바 언어가 자동으로 해주는 형변환
 *
 * 		primitive type 에서 implicit casting 방향
 *
 * 		byte → short → int → long → float → double
 *                 		↑
 *                    char
 *
 * 명시적 형변환(Explicit casting): 프로그래머가 직접 타입을 변환하는 것
 *
 *      (변환하고자 하는 타입명)변수/값
 *
 *
 *
 */
public class CastingMain {
    public static void main(String[] args) {

        // 암묵적 형변환 (자동형변환)
        byte num1 = 123;    // byte  int
        short s1 = 123;     // 123은 literal int 이지만 123 자체가 그냥 되니까~
        int n1 = s1;        // int  short
        double d1 = n1;     // double int
        char ch1 = 'A';
        n1 = ch1;

        // 명시적 형변환
        byte num5 = (byte)513; // 127까지만 가능한데... 값자기 된다고?
        System.out.println(num5); // 주의! 자료 소실 가능성 주의!

        int n = 10;
//        byte num6 = n;
        byte num6 = (byte)n;

        double avg1 = (99 + 88 + 78) / 3;
        double avg2 = (double)(99 + 88 + 78) / 3; // 명시적 형변환
        //                  int
        //                          int
        //  double 로 자동 형변환
        System.out.println("avg1 = " + avg1);
        System.out.println("avg1 = " + avg2);
    }
}
