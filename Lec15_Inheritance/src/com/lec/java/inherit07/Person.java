package com.lec.java.inherit07;

//public final class Person {  // final 클래스는 상속 불가
public  class Person {

    private String name;

    // 생성자
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected void showInfo(){
        System.out.println("이름: " + this.name);
    }


    // final 메소드는 overriding 불가
//    public final void whoAreYou(){
//        System.out.println("이름 : " + name);
//    }

}
