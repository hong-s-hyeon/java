package com.lec.java.array01;

public class Test {
    public static void main(String[] args) {

        // 선언 + 초기화
        int[] korea = {100, 76, 80};

        System.out.println(korea.length);

        int sum = 0;
        for (int i = 0; i < korea.length; i++) {
            System.out.println("점수: " + korea[i]);
            sum += korea[i];
        }
        System.out.println("총점: " + sum);
        System.out.println("평균: " + (sum / (double) (korea.length)));

        int[] arr = {1, 2, 3, 4, 5};
        
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {6}
        };


        


    }
}
