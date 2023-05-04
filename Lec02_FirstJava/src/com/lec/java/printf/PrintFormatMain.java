package com.lec.java.printf;
/*
        모든 자바프로그램은 main()  메소드부터 '시작'한다.
        프로그램 실행순서는 main() 의 첫 문장(statement)부터 차례대로 실행
        main() 의 마지막 문장까지 실행 마무리 되면 자바프로그램 종료
*/

/* 서식화된 문자열 (formatted string)
 *  ● 화면에 출력할때는 -> printf()
 *
 *    printf("서식문자열", 값1, 값2....)
 *
 *  ● 문자열(String)으로 만들때는 -> String.format()
 *
 *    String.format("서식문자열", 값1, 값2....)
 *
 *  ● format specifier (서식 지정자)
 *  	%d  :  십진수 정수로 출력
 *  	%f  :  실수 출력
 *  	%s  :  문자열 출력
 *  	%c  :  '문자하나' 출력
 *  	%x  :  16진수 정수로 출력
 *  	%%  :  % 출력
 */

public class PrintFormatMain {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi); // 3.141592653589793

        // printf : print with format
        // printf("서식문자열", 값1, 값2....)
        // 서식문자열 안에 %로 시작하는 서식문자들..

        System.out.printf("원주율 %f\n", pi);  // %f : 기본 실수 출력 (소숫점 6자리까지)
        System.out.printf("원주율 %.2f\n", pi);  // %.2f : 기본 실수 출력 (소숫점 6자리까지)

        int age = 10;
        int grade = 3;
//        System.out.printf("제 나이는 %d살입니다. 학년은 %d학년입니다."); // MissingFormatArgumentException
        System.out.printf("제 나이는 %d살입니다. 학년은 %d학년입니다.\n", age, grade);

        System.out.printf("%d,\n%x,\n%c\n", 65, 65, 65);

        // 출력폭 지정, 좌우 정렬
        System.out.printf("|%d|%d|%d|\n",100, 200, 300);
        System.out.printf("|%5d|%5d|%5d|\n",100, 200, 300); // 폭5칸, 우측정렬
        System.out.printf("|%-5d|%-5d|%-5d|\n",100, 200, 300); // 폭5칸, 좌측정렬

        double d = 183.47632;
        System.out.printf("|%6.1f|\n", d); // 총 6자리, 소수점 이하는 1자리



        // String.format()
        // 기본적으로 printf() 와 사용법은 동일함
        // 단, 화면에 출력하는게 아니라, 결과를 문자열(String) 으로 만들어서 리턴

        double rate = 123.0 / 167.0;
        String.format("합격률은 %.1f 입니다", rate);
        String result = String.format("합격률은 %.1f%% 입니다", rate);
        System.out.println(result);


        // Text Block 으로 포맷팅 가능
        String txt1 = """
                저는 %d 살입니다. 키는 %.1fcm 입니다.
                제이름은 [%10s] 입니다. 혈액형은 %c 입니다
                """.formatted(25, 174.2, "김순희", 'O');
        System.out.println(txt1);
    }
}
