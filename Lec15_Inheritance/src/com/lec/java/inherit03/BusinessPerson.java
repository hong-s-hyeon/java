package com.lec.java.inherit03;

public class BusinessPerson extends Person{

    String company;

    public void showInfo(){

        whoAmI();   // protected default public 접근제어자는 가능
        System.out.println("회사는 " + company + " 입니다.");
    }

    @Override
    public void whoAmI() {
//        Overrides:
//        whoAmI in class Person
        System.out.println("저는 오버라이딩입니다");
        super.whoAmI();
        System.out.println("회사는 " + company + " 입니다.");
    }

    @Override
    public String toString() {
        // Overrides:
        //toString in class Object
        return "이름 : " + name + ", " + "회사 : " + company;
    }
}
