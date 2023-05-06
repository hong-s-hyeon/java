package 반복제어문3.형성평가06;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 1;
        int j = 1;

        for (i = i; i <= num; i++) {           // 행
            int k = num - i; // 공백의 갯수
            int p = 1;  // 찍히는 숫자
            for (j = 1; j <= num; j++) {       // 열
                if(k > 0) {
                    System.out.print("  ");
                    k--;
                }
                else {
                    System.out.print(p + " ");
                    p++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
