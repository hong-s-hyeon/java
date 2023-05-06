package 문자열1.자가진단6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int in;
        while (true) {
            String str = sc.next();
            if(isInteger(str)){
                in = Integer.parseInt(str);
                if((in>=65 && in<=90) ||(in>=97 && in<=122) ) System.out.println((char)in);
                else System.out.println((int)str.charAt(0));

            } else if(isChar(str)){
                ch = str.charAt(0);
                System.out.println(ch);
            } else {
                break;
            }
        }// while
        sc.close();
    }//main

    public static boolean isInteger(String str) {
        try {
            int result = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isChar(String str){
        char ch = str.charAt(0);
        if ((ch>= 'a' && ch<='z') ||(ch>= 'A' && ch<='Z')){
            return true;
        }else{
            return false;
        }
    }
}