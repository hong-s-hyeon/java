package 선택제어문.형성평가02;

/*
 *정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
 *
 * 1개의 정수 입력
 *
 * zero plus minus
 *
 * */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("plus");
        } else if (num < 0) {
            System.out.println("minus");
        } else {
            System.out.println("zero");
        }

        sc.close();
    }
}
