package 입력.형성평가04;

//입력
//20 50 100
//출력
//sum = 170

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();

        System.out.println("sum = "+ (in1 + in2 + in3));
        sc.close();
    }
}
