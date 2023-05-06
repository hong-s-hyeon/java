package 반복제어문2.형성평가06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int sum = 0;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
                count++;
            }
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double) sum / count);

        sc.close();
    }
}
