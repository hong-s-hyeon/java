package com.lec.java.inner02;

/*
 	언제 내부 클래스로 설계?  
 	
	 상속 관계로 묶을 수는 없지만,
	 A라는 객체가 생성된 이후에야 존재할 수 있는 B라는 객체가 있다고 한다면,
	 B를 A의 멤버 '내부 클래스'로 선언한다.
	 (예) 컴퓨터-CPU/메모리, 자동차-타이어
	
	 반면
	 '햄버거 세트 메뉴' 객체의 경우
	 햄버거 객체와 콜라 객체는 별개의 객체로도 존재 가능하니까
 	'햄버거' 와 '콜라' 는 '세트메뉴' 객체의 '멤버변수'로 붙도록 하는게 낳다
 	
 	is-a  : 상속관계
 	has-a (종속) : 멤버내부클래스
 					ex>  컴퓨터가 있어야 비로소 CPU가 필요해? 이러면 종속
 	has-a (독립) : 멤버변수

 	Map.EntrySet >> EntrySet도 Map이 있어야 비로소 필요하다
 */
public class Inner02Main {

	public static void main(String[] args) {
		System.out.println("멤버 내부 클래스 활용");

		Car car = new Car("red", 4);


		car.getTire().displayInfo();


	} // end main()

} // end class Inner02Main













