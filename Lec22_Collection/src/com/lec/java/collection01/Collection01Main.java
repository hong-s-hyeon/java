package com.lec.java.collection01;

/* ArrayList<E>
     ※계층도 숙지 중요

     Collection<E>
      |__ List<E>
           |__ ArrayList<E>, LinkedList<E>

     List 특징(ArrayList와 LinkedList의 공통점)
     1. 중복 저장 허용
     2. 저장 순서 유지 (인덱스 존재)

     ArrayList:
     1. 저장 용량을 늘리는 데 많은 시간 소요 - 단점
                 >>  because : 중간에 넣을 때 , 그 뒷부분이 데이터가 옆으로 밀리면서 메모리 복사가 발생됨
     2. 데이터를 삭제하는 데 많은 연산 - 단점
                >>  because : 중간에 삭제할 때 , 앞으로 당겨지면서 메모리 복사가 발생됨
     3. 데이터 참조 매우 빠름 - 장점

     LinkedList:		// referencing 하는 관계
     1. 저장 용량을 늘리는 과정이 매우 간단 - 장점
     2. 데이터를 삭제하는 과정이 간단 - 장점
     3. 데이터 참조가 불편 - 단점
                 >> because : 참조를 따라가면서 해당 번지수를 찾아가야 한다.

     ※현업에서는 그냥 ArrayList 쓴다...ㅋㅋ
     ※ Vector<E> <-- ArrayList 와 비슷하나... ArrayList 추천.


     ※ 데이터 자료구조를 다룰시 각 자료구조에서 데이터에 대한 다음 동작들이 어떻게 되는지 주목하자
     - C (Create) 생성
     - R (Read) 조회
     - U (Update) 수정
     - D (Delete) 삭제

*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection01Main {

    public static void main(String[] args) {
        System.out.println("ArrayList<E>");

        // ArrayList 선언 - ArrayList 인스턴스 생성
        List<Integer> list1 = new ArrayList<>(); // 부모 = new 자식;  >> 다형성

        // 데이터 추가(저장): add(element) 메소드 사용
        //               add(index, element) -> index 번째 삽입
        list1.add(100);
        list1.add(400);
        list1.add(500);
        list1.add(200);
        list1.add(2, 700);  // 2번째 삽입
        list1.add(2, 200);  // 중복저장 가능.


        // 데이터 참조(읽기, 검색): get(index) 메소드 사용
        // size(): ArrayList의 크기를 반환(리턴)
        System.out.println("size() : " + list1.size());
        System.out.println("get() : " + list1.get(2));
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        // 데이터 삭제: remove(index) 메소드 사용
        list1.remove(2);
        System.out.println("삭제 후");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        // 데이터 수정: set(index, element) 메소드 사용
        list1.set(2, 333);
        System.out.println("수정 후");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        // ArrayList 출력 방법
        // 1) for
        // 2) Enhanced-for 사용
        // 3) Iterator(반복자) 사용
        // 4) forEach() 사용

        System.out.println("Enhanced for를 사용한 출력");
        // Enhanced for 사용 가능
		for (int a : list1) {
			System.out.println(a);
		}

		System.out.println("Iterator 를 사용한 출력");
		// 줄을 세워 놓고 차례차례 뽑아오는 것
        // Iterator(반복자) 사용법
        // iterator() 메소드를 사용해서 인스턴스 생성
		Iterator<Integer> itr = list1.iterator();    //줄세워놓은 객체
        // hasNext(): iterator가 다음 원소를 가지고 있는 지(true/false)
        // next(): 현재 iterator 위치의 원소를 값을 리턴하고,
        //   iterator의 위치를 다음 원소의 위치로 변경
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


		System.out.println("forEach() 를 사용한 출력");
        // forEach() + functional interface
        // Java8 부터 등장
		list1.forEach(it -> System.out.println(it));
		System.out.println();
		list1.forEach(System.out::println);


        System.out.println("toString() 사용");
        // Collection<> 대부분은 toString() 오버라이딩 되어 있다.
		System.out.println(list1);


        System.out.println("\n프로그램 종료");
    } // end main

} // end class










