package com.lec.java.inherit03;

public class BusinessPerson extends Person{

    String company;

    public void showInfo(){

        whoAmI();   // protected default public 접근제어자는 가능
        System.out.println("회사는 " + company + " 입니다.");
    }

}
