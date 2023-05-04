package com.lec.java.collection02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection02Main {

    public static void main(String[] args) {
        System.out.println("ArrayList 연습");
        //TODO:
        // String 타입을 담는 ArrayList를 만들고
        // 5개 이상의 String을 저장하고
        // set(), remove() 등의 메소드 사용하여
        // 임의의 것을 수정, 삭제 도 해보시고
        // 3가지 방식으로 출력해보세요
        //  for, Enhanced-for, Iterator

        List<String> stringList = new ArrayList<>();

        // Create
        stringList.add("가");
        stringList.add("나");
        stringList.add("다");
        stringList.add("라");
        stringList.add("마");

        // Read
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Update
        System.out.println("update 확인");
        System.out.println(stringList.set(0, "까"));
        stringList.set(2, "따");
        stringList.forEach(System.out::println);

        // Delete
        // 없는 것을 삭제하면?
        System.out.println(stringList.remove("다"));
        System.out.println(stringList.remove("따"));
        System.out.println("Delete 확인");

        for(String s: stringList){
            System.out.println(s);
        }

        //Iterator 사용
        System.out.println("Iterator 사용");
        Iterator<String> stritr = stringList.iterator();
        while(stritr.hasNext()){
            System.out.println(stritr.next());
        }




        System.out.println("\n프로그램 종료");
    } // end main()

} // end class












