package com.lec.java.collection08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection08Main {

    public static void main(String[] args) {
        System.out.println("HashSet 연습");

        // MyClass 타입을 저장할 수 있는 HashSet 인스턴스 생성
        // 데이터 3개 이상 저장해보고 iterator, enahnce-for 등을
        // 사용하여 출력해보기
        // TODO
        MyClass m1 = new MyClass(1, "가");
        MyClass m2 = new MyClass(2, "나");
        MyClass m3 = new MyClass(3, "다");

        Set<MyClass> hset = new HashSet<>();
        // 데이터 3개 저장
        // TODO
        hset.add(m1);
        hset.add(m2);
        hset.add(m3);

        // 검색: Iterator, enhanced for
        System.out.println();
        System.out.println("Iterator");
        // TODO
        Iterator<MyClass> itr = hset.iterator();
        while (itr.hasNext()) {
            MyClass value = itr.next();
            value.displayInfo();

        }


        System.out.println();
        System.out.println("enhanced for");
        // TODO
        for (MyClass m : hset) {
            m.displayInfo();

        }

        // forEach() 메소드 사용
        System.out.println();
        System.out.println("forEach() 사용");
        // TODO
        hset.forEach(a -> a.displayInfo());

        System.out.println("\n프로그램 종료");
    } // end main()
} // end class

