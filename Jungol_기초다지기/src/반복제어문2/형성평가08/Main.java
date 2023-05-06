package 반복제어문2.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(j == b) System.out.printf("%d",(i*j));
                else System.out.printf("%d ",(i*j));
            }
            System.out.println();
        }

        sc.close();
    }
}
