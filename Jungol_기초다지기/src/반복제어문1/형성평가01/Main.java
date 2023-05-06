package 반복제어문1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            if (i == a -1) System.out.println(i+1);
            else System.out.print((i + 1) + " ");
        }
        sc.close();
    }
}
