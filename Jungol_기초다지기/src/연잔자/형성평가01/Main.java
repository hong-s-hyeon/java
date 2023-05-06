package 연잔자.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int sum = a+ b+ c+ d;
        System.out.printf("sum %d\navg %d", sum, sum/4);

        sc.close();
    }
}
