package com.lec.java.for04;

public class For04Main {

    public static void main(String[] args) {
        System.out.println("for문 연습");

        // 1 ~ 100 수 중에서 2와 7의 공배수만 출력
        // 2와 7의 공배수: 2의 배수 && 7의 배수
        System.out.println("\n2와 7의 공배수 출력");
        // 1) 1 ~ 100 수를 모두 출력 (for문 이용)
        // 2) 조건에 맞는 경우만 출력을 하도록 수정 (if문)
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && (i % 7) == 0){
                System.out.println(i);
            }
        }


        // 1부터 n까지의 합을 계산
        int sum = 0;
        int n = 10000;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);


    } // end main ()

} // end class For04Main










