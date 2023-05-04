package 배열2.자가진단06;

/*
569 : 배열2 - 자가진단6
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=206&sca=10a0


[문제]
5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서
각 개인별로 평균이 80 이상이면“합격” 그렇지 않으면“불합격”을 출력하고
합격한 사람의 수를 출력하는 프로그램을 작성하시오.


[입력예]
85 67 95 65
80 95 86 56
100 98 67 86
95 76 84 65
67 86 90 76

[출력예]
fail
fail
pass
pass
fail
Successful : 2

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][4];


        // 점수 기입
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 합계 기입
        int[] disc = new int[5];

        // count
        int failure = 0;
        int success = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                disc[i] += arr[i][j];
            }
            if (((double) disc[i] / 4) >= 80) {
                System.out.println("pass");
                success += 1;
            } else {
                System.out.println("fail");
                failure += 1;
            }
        }

        System.out.println("Successful : " + success);


        sc.close();
    }
}












