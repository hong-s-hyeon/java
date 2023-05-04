package 연잔자.자가진단08;

//3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두
// 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
//
//        (JAVA는 1이면 true, 0이면 false를 출력한다.)
// 입력
// 10 9 9

// 출력
// 1 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();

        int result1;
        int result2;
        if( in1 > in2 && in1 > in3 ){
            result1 = 1;
        } else {
            result1 = 0;
        }

        if (in1 == in2 && in1 == in3){
            result2 = 1;
        } else {
            result2 = 0;
        }

        System.out.printf("%d %d", result1, result2);

    }
}
