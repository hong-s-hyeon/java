package com.lec.java.static02;

public class Test {
    int num;            // instance 변수
    static int sNum;    // class 변수(static 변수)

    // instance 메소드
    public void show(){
        System.out.println(num);
        System.out.println(sNum);
    }


    // class 메소드(static)
    public static void show2(){

        // static은 non-static을 사용할 수 없다!
//        System.out.println(num);
        System.out.println(sNum);
    }
}
