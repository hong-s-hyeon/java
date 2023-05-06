package 연잔자.자가진단01;

/*
세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)

10 25 33


sum : 68
avg : 22
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("sum : %d\navg : %d", (a+b+c), (a+ b+ c)/3);


        sc.close();
    }
}
