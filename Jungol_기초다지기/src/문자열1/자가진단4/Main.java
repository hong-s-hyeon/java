package 문자열1.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int a = sc.nextInt();
        if (str.length() >= a) {
            for (int i = 1; i <= a; i++) {
                System.out.print(str.charAt(str.length() - i));
            }
        }else{
            for (int i = 1; i <= str.length(); i++) {
                System.out.print(str.charAt(str.length() - i));
            }
        }


        sc.close();
    }
}
