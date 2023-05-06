package 연잔자.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1h, p1w, p2h, p2w;
        p1h = scanner.nextInt();
        p1w = scanner.nextInt();
        p2h = scanner.nextInt();
        p2w = scanner.nextInt();

        int value = ((p1h > p2h) && (p1w > p2w)) ? 1 : 0;
        System.out.println(value);


        scanner.close();
    }
}
