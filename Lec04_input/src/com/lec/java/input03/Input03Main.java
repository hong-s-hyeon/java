package com.lec.java.input03;

import java.util.Scanner;

public class Input03Main {
    public static void main(String[] args) {
        System.out.println("nextLine() vs next()");

        Scanner sc = new Scanner(System.in);

        System.out.print("여러 단어의 문장을 입력하세요 > ");
        String in = sc.nextLine();  // 한 라인 전체(\n 입력까지 가지고 감)
        System.out.println("in : " + in);

        // next()
        // 다음 토큰(token) 을 받아서 String 으로 리턴.
        System.out.print("여러 단어의 문장을 입력하세요 > ");
        String in1 = sc.next();
        System.out.println("in1 : " + in1);
        System.out.print("여러 단어의 문장을 입력하세요 > ");
        String in2 = sc.next();
        System.out.println("in2 : " + in2);
        System.out.print("여러 단어의 문장을 입력하세요 > ");
        String in3 = sc.next();
        System.out.println("in3 : " + in3);
        // 여러 단어의 문장을 입력하세요 > aaa bbb ccc
        //in1 : aaa
        //여러 단어의 문장을 입력하세요 > in2 : bbb
        //여러 단어의 문장을 입력하세요 > in3 : ccc
        // 한줄에 입력한 내용이 다 들어가버렸다... 토큰 단위 이기 때문에 buffer 안의 공백 앞에서 가지고 간다

        // 숫자 타입도 여러개의 '한 줄' 에 받을 수 있다.
        // > 100 3.14 300
        System.out.print("숫자 3개(int, double, int)를 입력받으세요 > ");
        int i1 = sc.nextInt();
        double d1 = sc.nextDouble();
        int i2 = sc.nextInt();

        System.out.printf("i1, d1, i2: %d, %f, %d", i1, d1, i2);
//        숫자 3개(int, double, int)를 입력받으세요 > 100 3.14 300
//        i1, d1, i2: 100, 3.140000, 300



        sc.close();
    }// end main()
}// end class
