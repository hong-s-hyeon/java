package practice.capitalize;

import java.sql.SQLOutput;
import java.util.Scanner;

/* LetterCapitalize
 * 	문장을 입력하고,  단어의 앞 문자를 대문자로 만들어 출력하기를 반복하다가
 *  quit 을 입력 받으면 종료하기
 *
 * 	[입력예]
 * 		hello my world
 *  [출력예]
 * 		Hello My World
 */

public class LetterCapitalize2 {

    // TODO : 필요한 메소드 있으면 추가 작성

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        String[] words;
        while (true) {
            str = sc.nextLine();
            // 종료 조건
            if (str.trim().equalsIgnoreCase("quit")) break;

            // 소문자로 변환
            str = str.toLowerCase();

            // 공백기준으로 단어 구분
            words = str.split("\\s+");

            // 각 단어들을 순환
            for(String word: words){
                // 맨 앞글자만 분리
                String firstLetter = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1); // 나머지 문자열

                // 앞글자의 대문자 + 나머지 문자열
                System.out.print(firstLetter + rest + " ");

            }
            System.out.println();


        }


        sc.close();
    } // end main()
} // end class
