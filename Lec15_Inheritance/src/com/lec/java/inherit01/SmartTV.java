package com.lec.java.inherit01;
// 상속은~
// 기존에 있는 코드를 재활용하기 위해서 만든다~
public class SmartTV {

    boolean isPowerOn;
    int channel;
    int volume;
    String ip;

    public void displayInfo(){
        System.out.println("--- TV 현재 상태 ---");
        System.out.println("전원: " + isPowerOn);
        System.out.println("채널: " + channel);
        System.out.println("볼륨: " + volume);
        System.out.println("IP주소: " + ip);
    }

}
