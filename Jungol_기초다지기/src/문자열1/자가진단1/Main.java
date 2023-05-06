package 문자열1.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("ASCII code =? ");
            int num = sc.nextInt();
            if(num < 33 || num>127){
                break;
            }
            char ch = (char)num;
            System.out.println(ch);

        }

        sc.close();
    }
}
/*
127
126
125
124
128
*/
