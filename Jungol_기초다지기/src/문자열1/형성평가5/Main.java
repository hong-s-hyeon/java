package 문자열1.형성평가5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.length() > str2.length()) System.out.println(str1.length());
        else System.out.println(str2.length());

        sc.close();
    }
}
