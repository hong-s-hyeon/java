package com.lec.java.lambda01;

/* 람다 표현식: lambda-expression
 * 	Java8 부터 도입:
 * 		(매개변수 리스트) -> 리턴값
 * 		(매개변수 리스트) -> {...}  수행코드
 *
 * 	추상메소드가 '하나뿐'인 인터페이스 구현. (이를 함수형 인터페이스 functional interface) 라 한다
 *
 * 	- 익명클래스의 더 간략화한 표현식
 * 	- 함수 한개(메소드 한개)를 표현하기 위한 식
 */

//인터페이스 정의
interface Addable {
    public abstract double add(double x, double y);
}

public class Lambda01Main {

    public static void main(String[] args) {
        System.out.println("인터페이스, 익명 클래스, 람다 표현식");

        System.out.println();
        System.out.println("[1] 인터페이스를 구현하는 클래스");
        Addable myadder = new AdderImple();
        System.out.println(myadder.add(1.11, 2.22));


        System.out.println();
        System.out.println("[2] 익명 클래스 사용");
        System.out.println(new Addable() {
            @Override
            public double add(double x, double y) {
                return x + y;
            }
        }.add(1.11, 2.22));

        System.out.println();
        System.out.println("[3] 람다 표현식(lambda expression) 사용");
        // 함수형 인터페이스이여야 한다
        // 함수형 인터페이스 : 메소드 하나만 구현되어있는 인터페이스
        myadder = (a, b) -> {
            return a + b;
        };
        myadder = (a, b)-> a + b;
        // 두개는 같은것

        System.out.println(myadder.add(1.11, 2.22));


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class

//인터페이스를 구현하는 클래스를 정의
class AdderImple implements Addable {

    @Override
    public double add(double x, double y) {
        return x + y;
    }
}











