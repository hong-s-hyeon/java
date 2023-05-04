package com.lec.java.input01;


import java.util.Scanner;

/*
 * 표준입력(Standard Input): 키보드로부터 입력
 * Scanner 객체 사용
 *
 */
public class Input01Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    객체 타입  변수명 = 객체 생성

        // 키보드를 사용한 작업 수행
        int num1, num2;
        System.out.print("숫자 1을 입력하세요: ");
        num1 = sc.nextInt(); // 키보드로부터 정수 한개를 입력받아서 리턴
        System.out.print("숫자 2을 입력하세요: ");
        num2 = sc.nextInt(); // 키보드로부터 정수 한개를 입력받아서 리턴

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // 만약 nextInt() 에서 문자를 입력하면 InputMismatchException 예외 발생

        // 각 primitive 타입에 대해 nextXXX() 메소드 제공
        //		sc.nextByte();
        //		sc.nextShort();
        //		sc.nextLong();
        //		sc.nextFloat();
        //		sc.nextDouble();
        //		sc.nextBoolean();

        sc.close(); // 자원 반납. ...... 자원이란? 유한한 것을 의미. 키보드는 1개. 즉 반납을 해야한다!
        // Scanner 객체를 사용한 뒤에는 반드시 close() 를 해주어야 한다
        // close() <-- 사용한 시스템 자원 (키보드, hw, 파일, 네트워크, 데이터베이스 등...) 을 시스템에 반납
    }
}
