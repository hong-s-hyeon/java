package 함수1.자가진단02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a <= 1000) {
            System.out.println(calcTot(a));
        }

        sc.close();
    }

    private static int calcTot(int a) {
        int sum = 0;

        for (int i = 1; i <= a ; i++) {
            sum += i;
        }
        return sum;

    }
}
