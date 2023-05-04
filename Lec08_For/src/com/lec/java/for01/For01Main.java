package com.lec.java.for01;


/*
 * ■ 순환문(loop)
 * 	- for
 * 	- while
 * 	- do ~ while

 *
 * ■ for 순환문 구문
 *
 * for(①초기식; ②조건식; ④증감식){
 * 		③수행문;
 * 		..
 * }
 *      ①초기식 : 최초에 단한번 수행
 *      ②조건식 : true / false 결과값
 *      		위 조건식의 결과가 false 이면 for문 종료
 *      ③수행문 : 위 조건식이 true 이면  수행
 *      ④증감식 : 수행문이 끝나면 증감식 수행
 *               증감식이 끝나면 다시 ②조건식 으로..
 *
 * 순환문을 작성시 내가 만드는 순환문에 대해 다음을 확실하게 인지하고 작성해야 한다
 * 1. 몇번 순환하는 가?
 * 2. 순환중에 사용된 인덱스값의 시작값과 끝값은?
 * 3. 순환문이 끝난뒤 인덱스값은?
 *
 *
    for문 작성시 TIP
	 1) n번 순환 하는 경우 (즉 횟수가 촛점인 경우)
	 for(int i = 0; i < n; i++){ .. }

	 2) a ~ b 까지 순환하는 경우 (즉 시작값과 끝값이 중요한 경우)
	 for(int i = a; i <= b; i++){ .. }
 */


public class For01Main {

	public static void main(String[] args) {
		System.out.println("for 반복문");

		System.out.println("Hello, Java 1");
		System.out.println("Hello, Java 2");
		System.out.println("Hello, Java 3");

		System.out.println();

		// for 문
		for(int count = 1; count <= 3; count++){
			System.out.println("Hello, Java " + count);
		}

		System.out.println();

		for(int count = 10; count > 0; count--){
			System.out.println(count);  // 10번

			// 끝난 시점에서 count 값은! 0
			// 그리고 count는 for문 block에서 선언된 지역 변수! 때문에 아래 코드는 안됨!
		}

//		System.out.println(count);  // for 안에서 선언한 변수는 지역변수!

		int cnt = 0;
		for(; cnt < 10; cnt += 2){
			System.out.print(cnt + " ");
		}
		System.out.println("\nfor 끝난후 cnt = " + cnt);

//		 위아래 같은 코드!!! 초기화를 어디서 해주었는지에 따라서 코드가 달라진다
//		int cnt;
//		for(cnt = 0; cnt < 10; cnt += 2){
//			System.out.print(cnt + " ");
//		}
//		System.out.println("\nfor 끝난후 cnt = " + cnt);





		// 초기식과 증감식에 식을 여러개 사용 가능
		System.out.println();
		int i, j;
		for(i = 0, j = 10; i < j; i++, j-=2){
			System.out.println("i:" + i + " j:" + j);
		}
		System.out.println("for 종료후 i:" + i + " j:" + j);

	} // end main()

} // end class For01Main









