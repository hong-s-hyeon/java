package 선택제어문.형성평가05;


/*
 *1~12사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 출력하는 프로그램을 작성하시오.
 *
 * hint
 * 평년의 경우 1월부터 12월까지 일수는 각각 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31일이다.
 *
 *
 * 2
 *
 * 28
 *
 *
 *
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num <= 7 && num >= 1) {
            if (num % 2 != 0) {
                System.out.println(31);
            } else {
                if (num == 2) {
                    System.out.println(28);
                } else {

                    System.out.println(30);
                }
            }
        } else if (num >= 8 && num <= 12) {
            if (num % 2 == 0) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        }


        sc.close();
    }
}