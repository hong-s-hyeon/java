package com.lec.java.method10;

import java.util.Scanner;

/* 메소드와 배열
 * 매개변수가 배열,  리턴타입이 배열
 */
public class Method10Main {

    public static void main(String[] args) {
        System.out.println("메소드와 배열");
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        inputScore(sc, score);
        System.out.println("최대값: " + findMax(score));


        sc.close();
        System.out.println("\n프로그램 종료");
    } // end main()

    // method name: inputScore
    // return: void
    // arguments:
    //   1) Scanner sc - 입력장치
    //   2) int[] score: 점수를 입력받아서 저장할 배열
    // TODO
    public static void inputScore(Scanner sc, int[] score) {
        System.out.println("length : " + score.length);

        for (int i = 0; i < score.length; i++) {
            System.out.print("정수" + (i + 1) + " 입력: ");
            score[i] = sc.nextInt();
        }
    }


    // method name: displayScore
    // return: void
    // arguments: int[] score - 출력할 점수가 저장된 배열
    // TODO


    // method name: calcTotal
    // return: int (계산된 총점을 리턴)
    // arguments: int[] score (점수들을 저장한 배열)
    // TODO


    // method name: findMax
    // return: int (최대값)
    // arguments: int[] score (점수들 저장된 배열)
    // TODO
    public static int findMax(int[] score) {
        int max = score[0];

        // enhanced for
        for (int x :
                score) {
            max = (x > max) ? x : max;
        }
        return max;
    }


    // method name: findMin()
    // return: int (최소값)
    // arguments: int[] score
    // TODO

    // method name: genRandom()
    // return: double[]  (생성된 난수 배열)
    // arguments: n  생성할 난수 개수
    // TODO

} // end class Method09Main












