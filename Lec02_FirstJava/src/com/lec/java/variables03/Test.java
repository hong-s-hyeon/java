package com.lec.java.variables03;

public class Test {
    public static void main(String[] args) {
        // 정수형 변수

        System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        byte a = (byte)127;
        byte b = (byte)128;
        System.out.println(a);
        System.out.println(b);

        byte c =  Byte.MIN_VALUE;
        System.out.println((byte)(c - 1));

        int korean = 50, eng = 50, math = 33;
        int total = korean + eng + math;
        double avg = (double) total / 3;
        System.out.println(total);
        System.out.println(total / 3.0);
        System.out.println(avg);


        // 명시적 형변환
        byte num5 = (byte)513; // 127까지만 가능한데... 값자기 된다고?
        System.out.println(num5); // 주의! 자료 소실 가능성 주의!
    }
}
