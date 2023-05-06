package 선택제어문.자가진단09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int min = ((a > b) && (c > b))? b : (a > c)? c : a;
        System.out.println(min);

        sc.close();
    }
}
