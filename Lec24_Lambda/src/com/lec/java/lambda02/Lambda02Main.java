package com.lec.java.lambda02;

/*	람다 표현식 (lambda - expression): 
         () -> 수행코드
         () -> 리턴값
         (매개변수..) -> 수행코드
         (매개변수..) -> 리턴값

     매개변수의 타입은 생략해서 표현이 가능
     매개변수가 여러개 있을 경우,
         모든 매개변수의 타입을 생략해서 표현하거나,
         모든 매개변수의 타입을 모두 다 표현해야 함.
*/
public class Lambda02Main {

    public static void main(String[] args) {
        System.out.println("익명 클래스, 람다 표현식 연습");

        // 매개변수 없고, 리턴값도 없는 경우
        // 함수형 인터페이스를 정의
        Test01 lambda01 = () -> System.out.println("안녕하세요");

        // 정의된 함수 실행
        lambda01.testPrint();


        System.out.println();
        // 매개변수 한개, 리턴값은 없는 경우
        Test02 lambda02 = (x) -> System.out.println("num = " + x);
        lambda02.testPrint(55);


        System.out.println();
        // 매개변수 여러개, 리턴값이 있슴.
        // 3가지 다됨
        Test03 lambda03 = (x, y) -> (x > y) ? x : y;
        System.out.println(lambda03.max(10, 20));

        lambda03 = (x, y) -> {
            return (x > y) ? x : y;
        };
        System.out.println(lambda03.max(10, 20));

        lambda03 = (int x, int y) -> {
            return (x > y) ? x : y;
        };
        System.out.println(lambda03.max(10, 20));


        // 매개변수 한개, 내부 수행코드 여러줄.., 리턴값.
        System.out.println();
        Test04 lambda04 = x -> {
            System.out.println(x);
            return x.length();
        };
        System.out.println(lambda04.myStrLen("Java"));


        System.out.println();
        // Test05 인터페이스 만들기
        // void printMax(double x, double y)

        // [실행]
        // .printMax(3.14, 1.2)

        // [출력양식 예제]
        // x = 3.14
        // y = 1.2
        // 3.14 > 1.2
        Test05 lambda05 = (a, b) -> {
            System.out.println("x = " + a);
            System.out.println("y = " + b);
            System.out.println(((a > b) ? a : b) + " > " + ((a < b) ? a : b));
        };
        lambda05.printMax(30, 20);


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class

















