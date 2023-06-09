package com.lec.java.class05;

public class Point {
    // 멤버 변수:
    //   1) double 타입의 xPos 선언, private
    //   2) double 타입의 yPos 선언, private
    // TODO
    private double xPos;
    private double yPos;



    // 생성자: 멤버 변수 초기화
    //   1) 디폴트 생성자
    // TODO
    public Point() {
    }


    //   2) Point(xPos, yPos)
    // TODO
    public Point(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }


    // 메소드
    // 멤버변수 xPos의 값을 전달받은 매개변수(x)의 값으로 변경하는 메소드
    // public void setXPos(double x)

    // 멤버변수 yPos의 값을 전달받은 매개변수(y)의 값으로 변경하는 메소드
    // public void setYPos(double y)
    // TODO
    public double getxPos() {
        return xPos;
    }
    public void setxPos(double xPos) {
        this.xPos = xPos;
    }
    public double getyPos() {
        return yPos;
    }
    public void setyPos(double yPos) {
        this.yPos = yPos;
    }


    // 메소드 이름: distance
    // 리턴 타입: double
    // 매개변수: Point
    // 기능: 자기위치에서 매개변수로 전달받은 점까지의 거리를 계산해서 리턴
    // Math.sqrt((x - pt.x) * (x - pt.x) + (y - pt.y) * (y - pt.y))
    // TODO
    public double distance(Point pt){
        return Math.sqrt((xPos - pt.xPos) * (xPos - pt.xPos) + (yPos - pt.yPos) * (yPos - pt.yPos));
    }

    // 메소드 이름: add
    // 리턴 타입: Point
    // 매개변수: Point
    // 기능: 두 점(자기자신, 매개변수로 받은 점)에서
    //    x좌표는 x좌표끼리, y좌표는 y좌표끼기 더하기
    // TODO
    public Point add(Point pt){
        this.xPos += pt.xPos;
        this.yPos += pt.yPos;
        return this;
    }

    public Point add(double a, double b){
        this.xPos += a;
        this.yPos += b;
        return this;
    }

    public String myPositon(){
        return "(" + xPos + ", " + yPos + ")";
    }

}









