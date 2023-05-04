package com.lec.java.collection06;

/* Set, HashSet<E>

	Collection<E>
	 |__ Set<E>
	      |__ HashSet<E>, TreeSet<E>
	
	 Set:
	 1. 자료의 중복 저장이 허용되지 않는다. (hashCode() 값의 중복여부!)
	 2. 저장 순서가 유지되지 않는다.(인덱스 없다.)
	 (예) {1, 2, 3} = {1, 1, 2, 2, 3} : 중복 저장이 안되기 때문에 같은 Set
	 (예) {1, 2, 3} = {1, 3, 2}: 저장 순서가 중요하지 않기 때문에 같은 Set
	
	 HashSet: 매우 빠른 검색 속도를 제공

	 	(※ HashXXX ← '검색속도 향상'을 쓰는 자료구조 입니다)
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection06Main {

	public static void main(String[] args) {
		System.out.println("HashSet 클래스");

		// Integer 타입을 저장할 수 있는 HashSet 인스턴스 생성
		Set<Integer> hset = new HashSet<>();

		// 데이터 저장: add()
		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(100);
		hset.add(400);
		hset.add(500);
		hset.add(1);
		hset.add(2);
		System.out.println(hset);

		// HashSet의 크기: size()
		System.out.println("hset.size() = " + hset.size());

		// Set은 중복 저장을 허용하지 않는다.

		// 데이터 검색:
		// Set은 인덱스가 없기 때문에 get() 메소드를 제공하지 않습니다.
		// 데이터 검색을 위해서는 Iterator를 사용해야 함
		System.out.println();
		System.out.println("Iterator");
		Iterator<Integer> itr = hset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		// 데이터 삭제
		// remove(element): Set에 있는 element를 찾아서 삭제
		//   element 있다면 삭제 후 true를 리턴
		//   element 없다면 false 리턴
		System.out.println();
		System.out.println("삭제 후~");
		System.out.println(hset.remove(1));        // index 1 이 아니다! object 1이다! (boxing)
		System.out.println(hset);
		for(int a: hset){
			System.out.println(a);
		}
		//✔️✔️✔️hashset 자료 찾는게 엄청 빠르다

		// Set 자료형 데이터 변경을 할 수 있는 set() 메소드를 제공하지 않습니다.
		// 삭제(remove) 후 추가(add)하면 변경하는 효과
		// TODO : 500 -> 555 로 변경하고 싶다면?
		hset.remove(500);
		hset.add(555);
		System.out.println("변경 후");
		Iterator<Integer> itrr = hset.iterator();
		while(itrr.hasNext()){
			System.out.println(itrr.next());
		}


		// enhanced-for 사용
		System.out.println();
		System.out.println("enhanced-for 사용");
		for(int a : hset){
			System.out.println(a);
		}

		// forEach() 메소드 사용
		System.out.println();
		System.out.println("forEach");
		hset.forEach(a->{
			System.out.println(a);
		});
		// TODO


		// toString() 제공됨
		System.out.println();
		System.out.println("toString");
		System.out.println(hset);


		System.out.println("\n프로그램 종료");
	} // end main()

} // end class












