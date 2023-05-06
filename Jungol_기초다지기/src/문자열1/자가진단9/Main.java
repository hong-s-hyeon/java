package 문자열1.자가진단9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strings = str.split("");
        int a = str.length();
        for (int i = (a - 1); i >= 0; i--) {
            for (int j = 0; j < a; j++) {
                if ((i + j) >= a) {
                    System.out.print(strings[i + j - a]);

                } else {
                    System.out.print(strings[i + j]);

                }
            }
            System.out.println();
        }

        sc.close();
    }
}
