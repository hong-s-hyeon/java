package com.lec.java.variables04;
/*
        모든 자바프로그램은 main()  메소드부터 '시작'한다.
        프로그램 실행순서는 main() 의 첫 문장(statement)부터 차례대로 실행
        문장의 끝은 반드시 세미콜론 ';' 으로 마무리 되어야 한다
        main() 의 마지막 문장까지 실행 마무리 되면 자바프로그램 종료
*/
public class Variable04Main {
    public static void main(String[] args) {
        double number1 = 3.141592;
//        float number2 = 3.14;
//        float type    literal (double type)
        float number2 = 3.14f; // >> float type 의 literal
        // 숫자 뒤에 f를 붙여주면, float 리터럴이 된다. 자바는 그 숫자를 float 타입으로 인식

        // 실수타입의 최대, 최솟값
        System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        // float : 1.4E-45 ~ 3.4028235E38
        System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        // double : 4.9E-324 ~ 1.7976931348623157E308

        float number4 = 1.23456789f;
        double number5 = 1.23456789;

        System.out.println("number4 : " + number4); // number4 : 1.2345679
        System.out.println("number5 : " + number5); // number5 : 1.23456789
        // 정밀도 문제가 있다.
        // float과 double은 저장할 수 있는 값의 크기만이 아니라
        // 소수점 이하 정밀도(precision)에서도 차이가 있다.
    }
}
