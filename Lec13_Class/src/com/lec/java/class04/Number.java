package com.lec.java.class04;

public class Number {

    // 멤버변수
    private int num;

    // 기본생성자
    public Number(){}

    // 매개변수가 있는 생성자
    public Number(int num){
        this.num = num;   // this: 자기자신(인스턴스)를 가리킴
    }

    // 메소드
    // getter: 멤버 변수의 값을 리턴해 주는 메소드
    // setter: 멤버 변수의 값을 변경해 줄 수 있는 메소드
    public int getNum(){return this.num;}

    public void setNum(int num){
        this.num = num;
    }

    public Number add(Number x){
        this.num += x.num;  // 원래는 안되지 getNum()으로 해야하지만, 클래스내부에서 정의할땐
                            // 그냥 x.num; 으로도 가지고 올 수 있다.
        return this;    // 자기 자신 리턴!!!!
    }

    // 메소드 오버로딩
    public Number add(int num){
        this.num += num;
        return this;
    }

    public Number sub(int num){
        this.num -= num;
        return this;
    }

    // 메소드 오버로딩
    public Number sub(Number x){
        this.num -= x.num;
        return this;    // 자기 자신 리턴!!!!
    }

}
