package 함수2.형성평가02;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(showInt(a, b));


        sc.close();
    }

    private static int showInt(double a, double b) {
        double aRoot = Math.sqrt(a);
        double bRoot = Math.sqrt(b);

        int max;
        int min;
        int count = 0;
        if (aRoot > bRoot) {
            max = (int)Math.floor(aRoot);
            min = (int)Math.ceil(bRoot);
        } else {
            max = (int)Math.floor(bRoot);
            min = (int)Math.ceil(aRoot);
        }

        for (int i = min; i <= max; i++) {
            count++;
        }

        return count;

    }


}
