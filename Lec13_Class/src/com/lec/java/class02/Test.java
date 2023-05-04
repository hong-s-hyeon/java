package com.lec.java.class02;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);

        System.out.println(c2.radius);

        c2.radius = 6;
        System.out.println(c2.radius);

    }
}
