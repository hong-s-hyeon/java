package com.lec.java.static03;

public class Test {


    // singleton 디자인 패턴
    private int num;

    // 일단 생성자를 private로 작성
    private Test() {
        num = 100;
    }

    // 이렇게도 할 수는 있다
//    private  Test(int num){
//        this.num = num;
//    }

    private static Test instance = null; // 생성된 인스턴스 참조

    public static Test getInstance(){
        if(instance == null){   // 기존에 생성된 인스턴스가 없다면?
            instance = new Test();  // 이 경우에만 생성한다~!
        }

        return instance;
    }

//      메소드 오버로딩을 통해서 이렇게도 할 수는 있어
//    public static Test getInstance(int num){
//        if(instance == null){
//            instance = new Test(num);
//        }
//
//        return instance;
//    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
