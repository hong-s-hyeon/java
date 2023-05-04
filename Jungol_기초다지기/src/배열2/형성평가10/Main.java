package 배열2.형성평가10;

/*
*
* 3행 5열의 2차원 문자배열 형태의 대문자들을 입력 받은 후 소문자로 바꾸어서 공백으로 구분하여 출력하는 프로그램을 작성하시오.
*
            A B C D E
            F G H I J
            K L M N O
*
            a b c d e
            f g h i j
            k l m n o
*
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] chars = new char[3][5];
        char[][] smallChars = new char[3][5];

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = sc.next().charAt(0);
                smallChars[i][j] = Character.toLowerCase(chars[i][j]);
            }
        }

        for(char[] row: smallChars){
            for(char c: row){
                System.out.print(c + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
