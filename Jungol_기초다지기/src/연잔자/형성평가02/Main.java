package 연잔자.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(String.format("%d / %d = %d...%d", a, b, a / b, a % b));

        sc.close();
    }
}

