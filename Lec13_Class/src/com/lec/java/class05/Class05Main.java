package com.lec.java.class05;

/* 메소드 체이닝 : method chaining
 *  	this는 자기자신 인스턴스 입니다.
 *  	메소드에서 this를 return 하면
 *  	호출한쪽에서 곧바로 연이어 호출 가능
 *  
 *   	객체.메소드1().메소드2().메소드2()....
 *   
 *  메소드체이닝을 사용하면, 반복되는 지루한 코딩을 줄여줄수 있다.
 *  프로그래밍시 각 메소드가 무엇을 리턴하는지는 항상 예의주시해야 합니다
 */
public class Class05Main {

	public static void main(String[] args) {
		System.out.println("클래스 정의 연습 : this, 메소드 체이닝");

		// TODO

		Point pt0 = new Point(0, 0);
		Point pt1 = new Point(1, 1);
		Point pt2 = new Point(1, 4);
		Point pt3 = new Point(5, 1);
		Point pt4 = new Point(4, 0);


		System.out.println("pt1 거리 : " + pt0.distance(pt1));
		System.out.println("pt2 거리 : " + pt0.distance(pt2));
		System.out.println("pt3 거리 : " + pt0.distance(pt3));
		System.out.println("pt4 거리 : " + pt0.distance(pt4));


		System.out.println();
		System.out.println("pt1 <> pt2 거리 : " + pt1.distance(pt2));
		if(pt1.add(pt4).distance(pt3) == pt3.distance(pt1)) System.out.println("정답");
		else System.out.println("메소드 다시 만들어!");


		System.out.println("프로그램 종료");
	} // end main()

} // end class Class05Main











