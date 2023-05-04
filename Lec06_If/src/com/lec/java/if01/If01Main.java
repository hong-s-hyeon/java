package com.lec.java.if01;

/* if, if ~ else 조건문
 *
 * 구문1:
 * 	if (조건식) {
 *  	조건식이 true 일때 실행되는 문장(들)
 *  	...
 * 	}
 *
 * 구문2:
 *  if (조건식) {
 *		조건식이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *		조건식이 false 일때 실행되는 문장(들)
 *		...
 *  }
 */
public class If01Main {

    public static void main(String[] args) {
        System.out.println("if 조건문");

        int num = -10;
        if (num > 0) {
            // if() 조건식이 true 일때 수행되는 부분
            System.out.println("양수 입니다");
        } else {
            // if() 조건식이 false 일 때 수행되는 부분
            System.out.println("음수 입니다");
        }

        num = 124;
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수 입니다");
        } else {
            System.out.println(num + "은 홀수 입니다");
        }

        //범위
        int score = 40;
        if (score >= 0 && score <= 100) {
            System.out.println("0 <= num4 <= 100");
        }

        // 도전 : 선택-자가2, 선택-자가3


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class
