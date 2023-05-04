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
		Point p0 = new Point(0, 0);
		Point p1 = new Point(1, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(3, 4);
		Point p4 = new Point(2, 0);

		System.out.println(p0.myPositon() +" 에서" + p3.myPositon()
				+ "거리 : " + p0.distance(p3));

		// Method Chaining! + Overloading
		double dis = p1.add(-1,0).add(1, 0).add(p4).add(p2).distance(p0);
		boolean isTrue = (dis == p3.distance(p0))? true: false;
		System.out.println(isTrue);

		System.out.println("프로그램 종료");
	} // end main()

} // end class Class05Main











