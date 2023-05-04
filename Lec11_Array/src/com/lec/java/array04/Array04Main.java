package com.lec.java.array04;

/* 연습
 * 길이 5개 int 형 배열을 선언하고
 * 사용자로부터 5개 정수를 입력받아 초기화 한뒤
 *
 * 총점, 평균, 최대값, 최소값  출력해보기
 */
public class Array04Main {

    public static void main(String[] args) {
        System.out.println("배열 연습");


//		int[] score = new int[];
        int[] score = new int[]{98, 43, 21, 67, 100};

        int total = 0;

        for (int i = 0; i < score.length; i++) {
			total += score[i];
        }
		double avg = (double) total / score.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		// 최대값
		System.out.println();
		int max = score[0];

		for(int i =1 ; i < score.length; i++){
			if(score[i] > max){
				max = score[i];
			}
		}
		System.out.println("최대값: " + max);

		// 최소값
		int min = score[0];
		for(int i =1 ; i < score.length; i++){
			if(score[i] < min){
				min = score[i];
			}
		}
		System.out.println("최소값: " + min);







        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array04Main








