package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String result = "";
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            if ((a > 100) || (a < 0)) {
                break;
            }
            sum += a;
            count++;

        }
        System.out.printf("sum : %d\navg : %.1f", sum, (double)(sum) / count);

        sc.close();

    }
}
