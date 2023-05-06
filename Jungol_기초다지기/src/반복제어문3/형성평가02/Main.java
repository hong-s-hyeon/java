package 반복제어문3.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int operand = 1;
        while(true){
            int result = operand * num;
            if(result > 100) break;
            operand++;
            System.out.print(result + " ");
            if (result % 10 == 0) break;
        }
        sc.close();
    }
}
