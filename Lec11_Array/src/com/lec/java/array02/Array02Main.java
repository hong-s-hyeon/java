package com.lec.java.array02;

/*  배열의 선언과 초기화

     배열 선언 따로, 초기화 따로
        타입[] 이름 = new 타입[배열의 길이];

    배열을 선언과 동시에 초기화 1
        타입[] 이름 = new 타입[] {a, b, c, ...};

    배열을 선언과 동시에 초기화 2
        타입[] 이름 = {a, b, c, ...};

    배열의 길이를 자동으로 알 수 있는 방법
        배열이름.length
 */
public class Array02Main {

    public static void main(String[] args) {
        System.out.println("배열의 선언과 초기화");

        // 1. 배열변수 (stack) 선언하고, 각각의 원소를 따로 초기화
        int[] korean = new int[3];
        korean[0] = 100;
        korean[1] = 90;
        korean[2] = 80;

        // 2. 배열 선언과 동시에 초기화 ver1
        int[] english = new int[]{30, 20, 35}; // length 3, int[] 배열 생성 + 초기화
        for (int i = 0; i < english.length; i++) {
            System.out.println("영어" + i + ": " + english[i]);
        }

        // 3. 배열 선언과 동시에 초기화 ver2
        int[] math = {99, 88, 77, 66, 15, 78, 99}; // new는 알아서 해줌

        // 배열의 길이 length
        System.out.println("math.length: " + math.length);

        // 수학점수 총점과 평균
        int sum = 0;
        for (int i = 0; i < math.length; i++) {
            sum += math[i];
        }
        System.out.printf("총점 : %d\n평균 : %.2f", sum, ((double)sum / math.length));

        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array02Main











