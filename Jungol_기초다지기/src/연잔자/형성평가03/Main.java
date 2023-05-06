package 연잔자.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("width = %d\n" +
                "length = %d\n" +
                "area = %d", (a += 5), (b *=2), (a * b));

        sc.close();
    }
}
