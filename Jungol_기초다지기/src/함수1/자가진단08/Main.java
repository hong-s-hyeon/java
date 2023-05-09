package 함수1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        printGugu(a, b);

        sc.close();
    }

    private static void printGugu(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            System.out.printf("== %ddan ==\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(String.format("%d * %d = %2d", i, j, (j * i)));
            }
            System.out.println();
        }
    }
}
