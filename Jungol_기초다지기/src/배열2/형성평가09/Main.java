package 배열2.형성평가09;
/*
행의 크기를 입력받아 파스칼 삼각형을 작성하여
마지막 행부터 첫 번째 행까지 차례로 출력하는 프로그램을 작성하시오. 행의 크기는 최대 10이다.

6

1 5 10 10 5 1
1 4 6 4 1
1 3 3 1
1 2 1
1 1
1

* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();


        for (int i = 1; i <= rows; i++) {
            int[][] pascal = new int[i][i];
        }


        sc.close();
    }

    public static void func(int i){
        int[][] pascal = new int[i][i];
        for(int[] row : pascal){
            int rowCount = 0;
           for(int x : row){
//               if(rowCount==)
           }
        }
    }
}
