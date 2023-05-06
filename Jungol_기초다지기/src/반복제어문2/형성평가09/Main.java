package 반복제어문2.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(j == num) System.out.printf("(%d, %d)", i, j);
                else System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }


        sc.close();
    }
}
