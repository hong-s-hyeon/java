package com.lec.java.inherit04;

public class Car extends Vehicle{

    int oil;

    //생성자

    public Car() {

        // 부모클래스의 기본생성자 호출 --> Vehicle()
        // 명시적으로 super() 가 없으면 기본적으로 부모의 기손생성자 호출
        System.out.println("Car() 생성");
    }

    public Car(int oil){

        // 명시적으로 부모생성자 호출 가능 super()
        super(887); // Call to 'super()' must be first statement in constructor body
        // 무조건 super()는 자식의 생성자에서 가장 윗 줄에 있어야 한다~!
        this.oil = oil;
        System.out.println("Car(int) 생성 : oil = " + oil);
    }

    public Car(int speed, int oil){
        super(speed);
        this.oil = oil;
        System.out.println("Car(int) 생성 : oil = " + oil);
    }

}
