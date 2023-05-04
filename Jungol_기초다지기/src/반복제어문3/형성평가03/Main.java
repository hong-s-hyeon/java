package 반복제어문3.형성평가03;
/*
* 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.

주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
*
*           3
*
            *
            **
            ***
            **
            *
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 1;
        while (num >= 0) {

            for (int i = 1; i <= count; i++) {
                // 별의 갯수가 증가하는 단계
                if (num > count) {
                    for (int j = 1; j <= count; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    count++;
                }// if end

                // 분기점 count == 3
                if (num == count) {
                    for (int j = 1; j <= count; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    num = 0;
                }

                // 별의 갯수가 감소하는 단계
                if (num < count) {
                    count--;
                    for (int j = 1; j <= count; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    if (count == 1) num = -1;
                }

            }// for end
        }// while end


        sc.close();
    }
}
