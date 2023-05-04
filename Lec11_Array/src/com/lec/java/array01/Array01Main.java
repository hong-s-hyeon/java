package com.lec.java.array01;

/* 배열(Array)
         동일 타입의 여러개의 데이터를 담는 집합자료형

     배열 선언
         자료타입[] 변수이름;
         ex> int[] arr;

     배열 원소 (element)
         배열에 담긴 각각의 데이터

     배열의 길이 (length)
         배열 원소의 개수, 즉 배열에 담긴 데이터의 개수

     배열 인덱스 (첨자, index)
         배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
         배열인덱스를 사용하여 배열원소에 접근하여 사용

     배열을 new로 생성한뒤에는 자동초기화 가 됨.
        숫자타입들은 --> 0으로
        boolean타입은 --> false 로
        객체타입(Object) 타입은 --> null 로.

     ★ 배열변수의 타입, 배열원소의 타입 확실히 구분하자
     ★ JVM 메모리 상에 생기는 구조 이해 필수
 */
public class Array01Main {

    public static void main(String[] args) {
        System.out.println("배열(Array)");

        // 배열이 필요한 이유
        // 동일타입 + 목적의 데이터(들)을 위해 매번 새로운 이름의 변수 생성... 힘들다...
        int korea1 = 99;
        int korea2 = 88;
        int korea3 = 77;

        // 배열 선언 & 초기화
        int[] korea = new int[3];
        // int 타입의 배열을 선언,
        // 3개의 int 타입을 저장할 수 있도록 초기화

        korea[0] = 90;    // 첫번째 배열원소에 int 값 90 을 대입
        korea[1] = 80;
        korea[2] = 70;
//		korea[3] = 80;		// ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // at com.lec.java.array01.Array01Main.main(Array01Main.java:47✨) <<< 발생 위치 표시

        System.out.println("국어0: " + korea[0]);
        System.out.println("국어1: " + korea[1]);
        System.out.println("국어2: " + korea[2]);
        System.out.println(korea);
        // 변수 korean 의 타입은?	---> int[] 타입
        // 변수 korean[0] 의 타입은?  ---> int 타입
        System.out.println();
        System.out.println("for문으로 까보기~!");
        for (int i = 0; i < korea.length; i++) {
            System.out.println(korea[i]);
        }

        System.out.println();

        int[] english = new int[5];
        System.out.println("0번째 학생의 영어점수 : " + english[0]); // 자바의 int는 기본적으로 0으로 초기화

        for (int i = 0; i < english.length; i++) {
            english[i] = i * 10;
            System.out.println("영어" + i + ": " + english[i]);
        }
        // 배열 변수 출력하면?
        System.out.println("배열 변수 : " + english + "\t" + korea);
        // 주소값(암호화된~)이 담긴다. 왜? reference Type (primitive type x )


        System.out.println("\n프로그램 종료");
    } // end main()

} // end class Array01Main









