package com.lec.java.collection09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* TreeSet

 Collection<E>
  |__ Set<E>
       |__ HashSet<E>, TreeSet<E>

 TreeSet: 데이터가 정렬된 상태로 저장(오름차순, 내림차순)
 
 	(※ TreeXXX ← 주로 '정렬'에 특화된 자료구조 입니다)
*/
public class Collection09Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 클래스");
		// Integer 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		Set<Integer> tset = new TreeSet<>();        // 다시 말하지만 다형성

		// 데이터 저장 : add()
		tset.add(11);
		tset.add(2);
		tset.add(14);
		tset.add(1);
		tset.add(7);
		tset.add(15);
		tset.add(5);
		tset.add(18);

		System.out.println(tset);
		System.out.println();
		// 데이터 검색 - Iterator 사용
		// TreeSet인 경우에 iterator() 메소드 오름차순 정렬
		Iterator<Integer> itr = tset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		System.out.println();
		System.out.println("내림차순:");
		// 내림차순 Iterator : descendingIterator() 사용
		Iterator<Integer> itr2 = ((TreeSet<Integer>) tset).descendingIterator(); // 다형성에 의해서 set에 정의된 메소드만 쓸수있으므로 downcasting 해줘야한다.
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

		// enhanced for
		System.out.println();
		System.out.println("enhanced for");
		// 오름차순.

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












