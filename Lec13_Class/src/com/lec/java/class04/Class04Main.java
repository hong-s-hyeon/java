package com.lec.java.class04;

/*
   클래스 안에서 this : 
    객체 내에서 자기자신(인스턴스)을 가리킴

   메소드 체이닝 (method chaining)
     자기자신을 리턴하여, 연이어 메소드
     호출 가능케 하는 메소드 설계
     보통 setter 와 이와 같은 동작을 수행하는 메소드들에 적용하면 좋다
*/
public class Class04Main {

    public static void main(String[] args) {
        System.out.println("this & 메소드 체이닝");

        // 메소드 체이닝 (method chaining)
        String str = "Hello";
        str.toUpperCase().concat("World").toLowerCase();

        Number n1 = new Number();
        System.out.println(n1.getNum());

        Number n2 = new Number(123);
        System.out.println(n2.getNum());

        n1.add(n2);
        System.out.println(n1.getNum());

        n1.add(n1);        // n1 > 246
        n1.add(n1);        // n2 > 492
        n1.add(n2).add(n1).add(n1);

        // overloading & method chaining!
        // 수행하고자하는 동작을 구현하고, 리턴을 자기 자신 객체를 리턴하게 만들면 된다~
        n1.sub(n1).sub(n2).add(1000).sub(500);

        System.out.println(n1.getNum());


        System.out.println("프로그램 종료");
    } // end main()

} // end class Class04Main










