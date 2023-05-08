package com.lec.stream03;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/* reduce() 연산
 * 
 *  전달된 스트림의 데이터를 2개를 소모하며 주어진 '연산' 수행
 *  주어진 연산은 결괏값 1개 리턴
 *
 *  reduce((전달된 스트림의 데이터) -> 연산기능)
 * 	reduce(초깃값, (전달된 스트림의 데이터) -> 연산기능)
 * 				  ↑
 * 				  직접 구현하든지,
 * 				  BinaryOperator 를 구현한 클래스
 * 
 *  기존의 주어진 연산 (count, sum 등..) 이 아닌 연산을 Stream 에 수행할때 필요
 *  
 * 데이터 연산 3대장
 *  	map : n개 -> n개
 *  	filter : n개 -> n`개 > (n' <= n)
 *  	reduce : n개 -> 1개
 */

// 중간 단게를 보여줄수 있으면 좋다!


public class Stream03Main {

	public static void main(String[] args) {
		System.out.println("reduce() 연산");
		
		int [] arr = {1, 2, 3, 4, 5};
		int result2;

		// 초깃값을 주지 않은 경우
		// Optional 리턴
		result2 = Arrays.stream(arr).reduce((a, b) -> a + b).orElse(0);
		System.out.println(result2);

		// 1, 2, 3, 4, 5
		//    3
		//       6
		//         10
		//            15  <-- <-- 결국 최종값은 한개다


		// 초깃값을 준 경우
		// 초깃값 타입으로 리턴함!
		result2 = Arrays.stream(arr).reduce(100, (a, b) -> a + b);
		System.out.println(result2);  // 115

		// 100, 1, 2, 3, 4, 5
		//    101
		//      103
		//        106
		//           110
		//              115

		System.out.println();
		// 문자열에서 길이가 가장 긴 문자열을 뽑아내기 		
		String [] greetings = {"안녕하세요~~~", "Hello", "Good morning", "반갑습니다"};
		String result;
		
		result = Arrays.stream(greetings).reduce("", (s1, s2) -> (s1.length() >= s2.length()) ? s1 : s2);
		System.out.println(result);

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


// 직접 구현도 가능
// TODO











