package com.lec.java.array11;

import java.util.Arrays;

/* for와 enhanced for의 차이점
     enhanced for문에서는 배열의 원소를 꺼내서
     변수에 복사(저장)해서 사용하는 것입니다.
     즉, 배열의 원소를 직접 변경하는 것은 불가능하다.
 */
public class Array11Main {

    public static void main(String[] args) {
        System.out.println("for와 enhanced for의 차이점");

        // TODO
        int[] arr = {11, 22, 33, 44, 55};

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("===============");
        System.out.println();
        System.out.println("2차원 배열에서 enhanced for");
        int[][] array = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9},
        };


        for(int[] row: array){
            for(int a: row){
                a = 3;
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(array));

        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array11Main









