package 선택제어문.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double review = sc.nextDouble();


        switch((int)(review)){
            case 4:
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            default:
                System.out.println("retake");
        }


        sc.close();
    }
}
