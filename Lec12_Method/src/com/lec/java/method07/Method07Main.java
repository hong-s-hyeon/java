package com.lec.java.method07;

import java.util.Random;

/* Math 클래스의 메소드
 */
public class Method07Main {

    public static void main(String[] args) {
        System.out.println("Math 객체의 메소드");

        // Math.random() : 0.0 <=  r < 1.0 사이의 난수 발생(double)
        double r;
        for (int i = 0; i < 10; i++) {
            r = Math.random();
            System.out.println(r);
        }

        System.out.println();
        // double Math.floor(num): num을 넘지 않는 가장 큰 정수(바닥)
        // double Math.ceil(num): num보다 큰 가장 작은 정수(천장)
        // long Math.round(num): num에서 소수점 사사오입 (반올림)
        System.out.println(Math.floor(2.7));    // 2
        System.out.println(Math.ceil(2.7));        // 3
        System.out.println(Math.round(2.7));    // 3

        System.out.println(Math.floor(-1.2));    // -2
        System.out.println(Math.ceil(-1.2));    // -1
        System.out.println(Math.round(-1.2));    // -1

        System.out.println(Math.floor(-2.7));    // -3
        System.out.println(Math.ceil(-2.7));    // -2
        System.out.println(Math.round(-2.7));    // -3

        System.out.println();
        System.out.println("1,2,3 범위중 난수 발생시키기");
        // TODO
        for (int i = 0; i < 5; i++) {
            double num;
            num = Math.random();     // 0 ~ 1
            num *= 3;                // 0 ~ 3
            num = Math.floor(num);     // 0, 1, 2
            num += 1;                // 1, 2, 3
            System.out.println((int) num);
        }


        System.out.println();
        System.out.println("로또: 1 ~ 45 숫자중에서 랜덤으로 6개 출력");
        // TODO


        System.out.println();
        System.out.println("Random 객체 사용하여 난수 출력");
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(3);        // 0 ~ 3 사이의 정수 난수 발생
            System.out.print(n + ", ");
        }
        System.out.println();


        System.out.println("\n프로그램 종료");
    } // end main()

    // TODO

} // end class









