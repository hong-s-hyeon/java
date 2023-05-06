package 문자열1.자가진단7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        /*if(str.length() > 100){
            return;
        }
        char[] chars = str.toCharArray();
        char[] result = new char[chars.length];
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            if(Character.isAlphabetic(chars[i])){
                result[count] = chars[i];
                count++;
            } // end if
        } //end for
        char c = '1';
        int i = 0;
        String str1 = "";
        while(c != '\u0000'){
            c = result[i];
            str1 += c;
            i++;
        }
        System.out.println(str1.toUpperCase());*/

        char[] chars = new char[100];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
            if(Character.isAlphabetic(chars[i])) System.out.print(String.valueOf(chars[i]).toUpperCase());
        }
        sc.close();
    } //main
}//class
