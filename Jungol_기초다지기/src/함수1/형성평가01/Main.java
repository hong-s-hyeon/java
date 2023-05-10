package 함수1.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printGol(str);


        sc.close();

    }

    private static void printGol(String str) {
        String[] arr = {"first", "second", "third"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("@@@@@@@@@@");
        }
    }
}
