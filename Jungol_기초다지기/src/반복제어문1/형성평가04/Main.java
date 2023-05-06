package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int a = 1;
        while(a != 0){
            a = sc.nextInt();
            if ((a % 3 != 0) && (a % 5 != 0)) count++;

        }

        System.out.println(count);
        sc.close();
    }
}
