package 문자열1.자가진단5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.length() < 20 && str2.length() < 20) {
            StringBuffer stringBuffer = new StringBuffer(str1 + str2);
            System.out.println(stringBuffer.length());

        }

        if (str1.length() < 20 && str2.length() < 20) {
            String result = str1 + str2;
            System.out.println(result.length());
        }

        if (str1.length() < 20 && str2.length() < 20) {
            String result = str1.concat(str2);
            System.out.println(result.length());
        }


        sc.close();
    }
}
