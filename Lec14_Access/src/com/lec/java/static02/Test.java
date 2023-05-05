package com.lec.java.static02;

public class Test {
    static int sNum;    // class 변수(static 변수)
    int num;            // instance 변수

    public Test() {
    }

    public Test(int num) {
        this.num = num;

    }

    // class 메소드(static)
    public static void show2() {

        // static은 non-static을 사용할 수 없다!
//        System.out.println(num);
        System.out.println(sNum);
    }

    // instance 메소드
    public void show() {
        System.out.println(num);
        System.out.println(sNum);
    }
}
