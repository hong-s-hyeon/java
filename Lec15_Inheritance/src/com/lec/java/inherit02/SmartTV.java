package com.lec.java.inherit02;

// extends 키워드를 사용하여 상속

// BasicTV
//   └─ SmartTV

// 자바 에선 오로지 '하나의 부모'로부터 상속받을수 있습니다 (단일 상속)
// 다중 상속 허용하지 않음

// ※ IntelliJ: 클래스에서 CTRL + H => Hierarchy 창 뜬다.

public class SmartTV extends BasicTV{

    String ip;      // 새로 추가되는 변수

    public void displayInfo(){
        // 만약 부모에 있는 displayInfo를 먼저 실행하고 싶다면?
        super.displayInfo();
        System.out.println("IP 주소: " + this.ip);
    }

}













