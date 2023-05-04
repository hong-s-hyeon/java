package com.lec.java.collection10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 연습");

		// String 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		// 5개 이상의 데이터를 저장해보고
		// 오름차순, 내림차순으로 출력해보기
		Set<String> tset = new TreeSet<>();

		// 저장
		tset.add("apple");
		tset.add("Apple");
		tset.add("aPple");
		tset.add("apPle");
		tset.add("appLe");
		tset.add("APPLE");
		System.out.println(tset);

		// 오름 차순
		System.out.println();
		System.out.println("오름차순");
		for(String a: tset){
			System.out.println(a);
		}

		// 내림차순
		System.out.println();
		System.out.println("내림차순");
		Iterator<String> itr = ((TreeSet) tset).descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		System.out.println("\n프로그램 종료");
	} // end main

} // end class

















