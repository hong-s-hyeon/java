package 함수2.형성평가07;


/*
 *
 * 원주율을 3.141592로 매크로 상수로 정의하고 원의 넓이를 구하는 매크로 함수를 작성하여 반지름을 입력받아 원의 넓이를 출력하는 프로그램을 작성하시오. (소수 넷째자리에서 반올림)
 * radius : 1.5
 * area = 7.069
 *
 * */

import java.util.Scanner;

public class Main {
    public static final double PI = 3.141592;


    public static void main(String[] args) {
        System.out.print("radius : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(calcCirleArea(radius));
        sc.close();
    }

    public static String calcCirleArea(double r) {
        return "area = " + ((Math.round(r * r * PI * 1000) / 1000.0));
    }

}
