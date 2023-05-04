package 반복제어문2.형성평가04;

/*
* 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)
*

*    3
    99 65 30
*
*    64.67
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int sum = 0;
        int any = sc.nextInt(); // 첫번째 수
        sum += any;

        // 총 count - 1 번 sum에 더해주는 것
        for (int i = 0; i < (count - 1); i++) {
            any = sc.nextInt();
            sum += any;
        }

        System.out.printf("%.2f", ((double) sum / count));


        sc.close();
    }
}
