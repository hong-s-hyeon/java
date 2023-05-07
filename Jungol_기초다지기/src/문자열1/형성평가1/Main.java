package 문자열1.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strings1 = str.split("\\s+");
        for (int j = 0; j < strings1.length; j++) {
            System.out.println((j+1) + ". "+ strings1[j]);

        }


        sc.close();
    }
}
