package 문자열1.자가진단8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.split(" ").length);

        sc.close();
    }
}
