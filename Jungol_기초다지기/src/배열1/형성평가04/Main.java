package 배열1.형성평가04;


/*
배열1 - 형성평가4

100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가
-1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
(입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)


[입력예]
30 20 10 60 80 -1

[출력예]
10 60 80

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int i = 0;
        while (true) {
            arr[i] = sc.nextInt();
            if (arr[i] == -1) break;
            i++;
        }

//        if (i >= 4) {
//            System.out.printf("%d %d %d", arr[i - 3], arr[i - 2], arr[i - 1]);
//        } else {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("%d ", arr[j]);
//            }
//        }
        int startIndex = (i - 3 > 0) ? i - 3 : 0;
        for (int j = startIndex; j < i; j++) {
            System.out.print(arr[j] + " ");
        }


        sc.close();
    }
}












