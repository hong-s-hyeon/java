package 함수1.형성평가04;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a >= 0 && b >= 0) {
            int result = calculate(a, b);
            System.out.println(result);
        }

        sc.close();
    }

    private static int calculate(int a, int b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        return (int)(max * max - min * min);
    }
}
