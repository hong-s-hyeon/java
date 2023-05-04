package com.lec.java.variables02; // 패키지 위치는 반드시 명시 하여야 Variable02Main 실행가능!!!

public class Variable02Main {  // 클래스이름과 파일의 이름이 같아야 한다!!!
                                // Class Variable02Main' is public, should be declared in a file named 'Variable02Main.java'
    public static void main(String[] args) {
        //변수 선언과 동시에 초기화
        int num1 = 10;
        System.out.println("num1 = " + num1);

        // 한번에 같은 타입의 변수 여러개 선언 가능
        int a, b, c;

        // refactoring
        int korean = 50, eng = 50, math = 33;
        System.out.println("총점 : " + (korean + eng + math));

        int total = korean + eng + math;
        System.out.println("total : " + total);

        // 평균
        System.out.println("평균 : " + (total / 3)); // int int >> int
        System.out.println("평균 : " + (total / 3.0)); // int double >> double(default)
        System.out.println("평균 : " + (total / 3.0f)); // int float >> int
        System.out.println("평균 : " + (total / 3.0d)); // int double >> int
        System.out.println("평균 : " + ((double)total / 3.0d));
        // (double) > 형변환 연산자 사용해서 명시적으로 형(type) 변환

        // 변수명 바꿀대는 refactor-remane 사용하자! shift + F6
        int $;
        $ = 10;
        System.out.println($);
        // 변수명으로 사용가능
        // 알파벳, 숫자, _
        // 숫자로 시작 x
        // 띄어쓰기 안됨
        // 대소문자 구분
        // 중복 안됨
        //✨자바에서는 일반적으로 cammel notation을 사용한다
        // mylittletoy >> myLittleToy 자바
        // my_little_toy >> 파이썬ㅋㅋ



    }
}
