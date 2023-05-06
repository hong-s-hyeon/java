package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            if (a == 0) break;
            sum += a;
            count++;
            if (count == 20) break;
        }
        System.out.println(sum + " " + (sum / count));
        sc.close();
    }
}
