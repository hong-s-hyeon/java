package 반복제어문2.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();


        for (int j = 1; j <= 9; j++) {
            if (a > b) {
                for (int i = a; i >= b; i--) {
                    System.out.printf("%d * %d = %2d   ", i, j, (i * j));
                }
            } else {
                for (int i = a; i <= b; i++) {
                    System.out.printf("%d * %d = %2d   ", i, j, (i * j));
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
