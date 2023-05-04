package com.lec.java.exception03;

/*  예외 처리: try ~ catch
      연습 01패키지에서 발생하던 예외들을 try~catch로 잡아보자

      주의! : try 블럭 안에서 선언된 변수는 try 블럭안에서만 사용되는 지역변수가 된다.
         catch 블럭등 다른 블럭에서도 사용 가능하게 하려면 try 바깥에서 선언해야 한다
 */
public class Exception03Main {

    public static void main(String[] args) {
        System.out.println("예외 처리: try ~ catch");

        System.out.println();
        System.out.println("[1] ArithmeticException");

        int num1 = 0;
        int num2 = 0;
        // TODO : try ~ catch 로 감싸기
        try {
            System.out.println("num1 / num2 = " + (num1 / num2));

        } catch (ArithmeticException e) {
            System.out.println("0 으로 나누면 안되요~");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("[2] ArrayIndexOutOfBoundsException");
        int[] numbers = new int[10];
        try {
            numbers[100] = 111;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("인덱스는 0 부터 " + numbers.length + " 까지 입니다");

        }


        System.out.println();
        System.out.println("[4] NullPointerException");
        try {
            String str = null;
            System.out.println("스트링 길이: " + str.length());
        }catch (NullPointerException npe){
            System.out.println("null 뒤에는 . 을 찍으면 안되요");
            System.out.println(npe.getMessage());
        }


        System.out.println();
        System.out.println("[5] ClassCastException");
        Object obj = new int[10];

        try{
            String str = (String)obj;
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("\n프로그램 정상종료");
    } // end main

} // end class Exception03Main












