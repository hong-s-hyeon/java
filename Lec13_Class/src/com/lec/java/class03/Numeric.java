package com.lec.java.class03;

public class Numeric {

    private char ch;
    private byte operator;
    private int operand1;
    private int operand2;

    private boolean expired;


    // IntelliJ 의  generator 를 사용하면 손쉽게 자동 코드 생성
    // ALT + INSERT : 생성자, getter, setter 등..
    // 기본 생성자
    public Numeric() {
    }

    // 매개변수 받는 생성자
    public Numeric(char ch, byte operator, int operand1, int operand2) {
        this.ch = ch;
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // getter & setter
    // getter
    public char getCh() {
        return ch;
    }
    public void setCh(char ch) {
        this.ch = ch;
    }
    public byte getOperator() {
        return operator;
    }
    public int getOperand1() {
        return operand1;
    }
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }
    public int getOperand2() {
        return operand2;
    }
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    public boolean isExpired() {
        return expired;
    }
    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}












