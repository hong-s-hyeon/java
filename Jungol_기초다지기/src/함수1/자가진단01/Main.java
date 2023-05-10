package 함수1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        printSpecial(a);

        sc.close();
    }

    private static void printSpecial(int a) {
        String str = "~!@#$^&*()_+|";
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
}
