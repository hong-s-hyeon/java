package 입력.자가진단05;
//두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
//
//        (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)

// 입력
// 16 5

// 출력
// 16 * 5 = 80
// 16 / 5 = 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in1 = sc.nextInt();
        int in2 = sc.nextInt();

        System.out.println(in1 + " * " + in2 + " = " + (in1 * in2));
        System.out.println(in1 + " / " + in2 + " = " + (in1 / in2));
    }
}
