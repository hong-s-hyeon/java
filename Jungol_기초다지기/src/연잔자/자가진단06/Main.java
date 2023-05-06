package 연잔자.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("%d > %d --- %d\n", a, b, (a > b) ? 1 : 0);
        System.out.printf("%d < %d --- %d\n", a, b, (a < b) ? 1 : 0);
        System.out.printf("%d >= %d --- %d\n", a, b, (a >= b) ? 1 : 0);
        System.out.printf("%d <= %d --- %d\n", a, b, (a <= b) ? 1 : 0);

        scanner.close();
    }
}
