package com.lec.java.loop02;

/* continue;
 * 순환문(for, while, do~while) 안에서 continue   를 만나면
 * continue를 감싸는 가장 가까운 순환문 으로 돌아감
 *
 * 순환문은 종료하지 않고 . 특정 조건만 스킵!
 */

public class Loop02Main {

    public static void main(String[] args) {
        System.out.println("continue;");

        int num = 1;
        while (num <= 10) {
            num++;

            if (num % 2 == 0) {
                continue;
            }

            System.out.println(num);
        }


        System.out.println();
        // for문과 continue를 사용해서
        // 1 ~ 10 숫자 중 짝수만 출력

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        } // end for


        System.out.println();
        // 2단은 x 2 부터 출력
        // 3단은 x 3 부터 출력

        // TODO
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 2) continue;
                if (i >= 2) break;
                System.out.printf("2 * %d = %d\n", j, (2 * j));
            }
            if (i == 3) continue;
            System.out.printf("3 * %d = %d\n", i, (3 * i));

        }


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class


















