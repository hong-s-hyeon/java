package com.lec.java.collection03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection03Main {

    public static void main(String[] args) {
        System.out.println("ArrayList 연습");

        //TODO:
        // Student 타입을 담는 ArrayList를 만드고
        // 사용자로부터 3개의 Student 데이터 을 입력받아서
        // 3가지 방법으로 출력해보세요.
        // for, Enhanced-for, Iterator

        Score s1 = new Score(100, 90, 88);
        Score s2 = new Score(80, 100, 88);
        Score s3 = new Score(70, 90, 100);

        Student stu1 = new Student(1, "김갑순", s1);
        Student stu2 = new Student(2, "장갑순", s2);
        Student stu3 = new Student(3, "홍갑순", s3);

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (Student s : list) {
            Student.printTotal(s);
            if (s.getScore().getMath() >= 90) {
                System.out.println("수학잘하네?");
            }
        }

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student st = itr.next();
            Student.printTotal(st);
            if (st.getScore().getMath() >= 90) {
                System.out.println("수학잘하네?");
            }
        }


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class









