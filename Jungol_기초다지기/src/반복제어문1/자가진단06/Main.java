package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
            int num = sc.nextInt();
            System.out.println();
            switch (num) {
                case 1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");
                    isTrue = false;
            }
        }
        sc.close();
    }
}
