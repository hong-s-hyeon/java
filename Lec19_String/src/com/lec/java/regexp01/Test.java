package com.lec.java.regexp01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        System.out.println("정규표현식 regular expression");

        String input;  // 입력 문자열
        String regex;  // 정규표현식
        Pattern pat;
        Matcher matcher;

        regex = "My...."; // My로 시작하고 임의의 문자 4개
        pat = Pattern.compile(regex);
        input = "-My-1234-";

        matcher = pat.matcher(input); // Matcher 객체 리턴


        if (matcher.find()) {
            System.out.println(matcher.group() + "{" + matcher.start() + " ~ " + matcher.end() + "}");
        } else {
            System.out.println("find() 매칭 실패");
        }

        // 위를 다시 실행하면?, 다음 패턴매칭을 시도한다 --> 결과는 실패!
        // find() 를 계속 호출하면 위에서 매칭한 이후부터 매칭을 시도한다
        if (matcher.find()) {
            System.out.println(matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");
        } else {
            System.out.println("find() 매칭 실패");
        }

    }
}