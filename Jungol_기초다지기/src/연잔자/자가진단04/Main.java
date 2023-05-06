package 연잔자.자가진단04;
/*
두 개의 정수를 입력받아서  첫 번째수는 후치 증가 연산자를 사용하고
 두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후
  각각의 값을 출력하는 프로그램을 작성하시오.

10 20

11 19 190
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        a++;
        System.out.println(a + " " + (--b) + " " + (--a * b));

        sc.close();
    }
}
