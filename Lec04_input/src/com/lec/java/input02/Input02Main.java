package com.lec.java.input02;

import java.util.Scanner;

/*
 * 문자열 (String) 입력
 * char 입력
 */
public class Input02Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // line 단위 String 입력
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();   // ENTER 를 입력할때까지의 모든 문자들이 문자열(String)로 리턴

        System.out.print("별명을 입력하세요: ");
        String nick = sc.nextLine();

        System.out.printf("이름은 %s\n별명은: %s\n", name, nick);

        // char  입력
        // nextChar() 란 메소드는 없다.
        System.out.print("성별을 입력하세요 M/F: ");
        char gender = sc.next().charAt(0); // next() 메소드로 토큰단위 String 읽은 뒤에  첫문자만 가져오기
        System.out.println("성별: " + gender);

//		next() 및 nextXXX() 공백 단위(토큰 단위)로 문자열을 읽기
//		nextLine()는 Enter 단위로 문자열 읽기

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.nextLine(); // 왜? next & nextXXX 이런 애들은 토큰 단위여서 입력하고 엔터하고 나면 엔터 앞으로 값을 가지고 간다
                        // 그런데 nextLine()은 enter를 기준으로 가지고 가는데 시작하자마자 기존에 있던 enter가 있어서
                        // 아무 값도 가지고 오지 못하고 나와버리는것. 즉 빈값이 addr에 담기는 것이다.
                        // 이걸 해결해주기 위해서 nextLine앞에는 nextLine을 한번 더 해줘서 해당 enter를 없애주어야 한다.

        System.out.print("주소를 입력하세요: ");
        String addr = sc.nextLine();

        System.out.println("나이: " + age + "\n주소: " + addr);




        sc.close(); // 자원 반납
    } // end main()
}// end class
