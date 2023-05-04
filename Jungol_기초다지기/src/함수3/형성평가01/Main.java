package 함수3.형성평가01;

/* 231 : 함수3 - 형성평가1
http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=131&sca=10d0

문제
자연수 N을 입력받아 1부터 N까지 출력을 하되 n-1번째 값은 n번째 값을 2로 나눈 몫이 되도록 하는 프로그램을 작성하시오.

입력 예]
100

출력 예]
1 3 6 12 25 50 100
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String blank = "";
        calBacknumber(num, blank);

        printNum(num);


        sc.close();
    }// end main

    /*
     *   num String
     *   (num-1)/2 String
     *   (num-2)/2  String
     * */
    public static void calBacknumber(int num, String blank) {
        String result = " " + num + blank;
        num /= 2;
        if (num == 1) {
            System.out.println(num + result);
            return;
        }
        calBacknumber(num, result);
    }// end method

    private static void printNum(int n){
        if(n < 1) return;
        printNum(n/2);      // 재귀 호출
        System.out.print(n + " ");

    }

}// end class
