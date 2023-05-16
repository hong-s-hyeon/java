package 문자열2.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        double b = sc.nextDouble();
        String str = sc.next();
        String result = String.format("%d%.3f%s", a, b, str);
        if (result.length() % 2 != 0) {
            System.out.println(result.substring(0, (result.length() / 2 + 1)));
            System.out.println(result.substring((result.length() / 2 + 1)));
        } else {
            System.out.println(result.substring(0, result.length() / 2));
            System.out.println(result.substring(result.length() / 2));
        }

        sc.close();
    }
}

