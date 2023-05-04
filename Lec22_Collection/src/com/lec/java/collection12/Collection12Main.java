package com.lec.java.collection12;

// Hash: 검색을 빠르게 하기 위한 용도
// Tree: 데이터 정렬을 하기 위한 용도

import java.util.*;

public class Collection12Main {

	public static void main(String[] args) {
		System.out.println("TreeMap 클래스");

		// TreeMap<Integer, String> 타입 인스턴스 생성
		Map<Integer, String> tmap = new TreeMap<>();

		// 데이터 저장: put(key, value) 메소드 사용
		tmap.put(1, "aaa");
		tmap.put(3, "asdf");
		tmap.put(4, "zxcv");
		tmap.put(2, "qwerty");

		System.out.println(tmap); // 알아서 키 오름차순 정렬

		// values() : value 들로 이루어진 Collection 리턴
		System.out.println("values()");
		System.out.println(tmap.values());
		System.out.println(tmap.keySet());

		for(String value: tmap.values()){
			System.out.println(value);
		}
		System.out.println();
		System.out.println("keyset efor");
		for(int key: tmap.keySet()){
//			System.out.println(value);
			System.out.println(key + " : " + tmap.get(key));
		}

		// 데이터 검색: get(key) 메소드를 사용
		// 1. 키값들로만 이루어진 Set을 만듬
		System.out.println();
		Set<Integer> kset = tmap.keySet();


		// 2. keySet을 가지고 iterator를 만듬
		Iterator<Integer> itr = kset.iterator();
		while(itr.hasNext()){
			int key = itr.next();
			System.out.println(key + " : " + tmap.get(key));
		}


		System.out.println();

		// key 역순 출력
		// TreeMap에만 있는 KeySet을 만들어 내는 메소드
		NavigableSet<Integer> navi = ((TreeMap) (tmap)).navigableKeySet();
		itr = navi.descendingIterator();
		while(itr.hasNext()){
			int key = itr.next();
			System.out.println(key + " : " + tmap.get(key));
		}


		// HashMap --> TreeMap 전환하기
		System.out.println("HashMap() -> TreeMap() ");
		HashMap<String, Integer> hmap = new HashMap<>();

		hmap.put("최영", 20000);
		hmap.put("이순신", 50000);
		hmap.put("강감찬", 70000);

		System.out.println(hmap);

		System.out.println();
		TreeMap<String, Integer> tmap2 = new TreeMap<>(hmap); // hmap을 가지고 한다
		System.out.println(tmap2);

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class


















