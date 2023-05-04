package com.lec.java.collection04;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		List<MemberModel> list = new ArrayList<>();

		MemberModel m1 = new MemberModel("root", "1234", 23);
		MemberModel m2 = new MemberModel("admin", "7777", 42);
		MemberModel m3 = new MemberModel("user1", "8888", 17);

		// 저장
		list.add(m1);
		list.add(m2);
		list.add(m3);

		//toString() 결과
		System.out.println(list);

		//pw가 "7777"인 것들을 찾아서 pw 를 "333"으로 바꾸기
		for(MemberModel m: list){
			if(m.getPasswd().equals("7777")){
				m.setPasswd("3333");
			}
		}
		System.out.println(list);

		//강사님 풀이
		for (int i = 0; i < list.size(); i++) {
			MemberModel m = list.get(i);
			if(m.getPasswd().equals("7777")){
				m.setPasswd("3333");
			}
		}
		System.out.println(list);
		// ================

		System.out.println();
		//list 안의 Member들의 나이 평균
		int ageTotal = 0;
		Iterator<MemberModel> m = list.iterator();
		while(m.hasNext()){
			ageTotal += m.next().getAge();
		}
		double ageAvg = (double) ageTotal / list.size();
		System.out.println("평균 나이 : " + ageAvg);


		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












