package 배열1.형성평가10;
/*
* 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
*
        5
        35 10 35 100 64

*
*
        100
        64
        35
        35
        10


* */


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] scores = new int[num];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores); // return null? >> 원본변화..!!

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(scores[i]);
        }

        sc.close();
    }
}
