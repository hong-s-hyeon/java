package 문자열2.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if (str.equals("END")) break;

            for (int i = str.length() - 1; i >= 0; i--) {
                if (i != str.length() - 1) System.out.print(str.substring(i, i + 1));
                else System.out.print(str.substring(i));
            }
            System.out.println();
        }


        sc.close();
    }
}
