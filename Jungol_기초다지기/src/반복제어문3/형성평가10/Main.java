package 반복제어문3.형성평가10;

/*
*자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
10 미만의 홀수만 출력하시오.
주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다
*
*
        3
*
*
*
        1 3 5
        7 9 1
        3 5 7
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        while (num * num > count) {
            for (int i = 1; i < 10; i += 2) {
                // 종료 조건
                if(count == num * num){
                    break;
                }
                //엔터 조건
                if(count % num == 0 && count != 0){
                    System.out.println();
                }
                //수행 코드
                System.out.print(i + " ");
                //변화
                count+=1;
            }
        }
        sc.close();
    }
}
