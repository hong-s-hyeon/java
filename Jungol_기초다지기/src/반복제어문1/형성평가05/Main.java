package 반복제어문1.형성평가05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = new ArrayList<>();

        while(true){
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            double area = base * height / 2;
            list.add(area);
            sc.nextLine();
            char con = sc.nextLine().charAt(0);
            if((con != 'y') && (con != 'Y')){
                break;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Base = Height = Triangle width = %.1f\n", list.get(i));
            System.out.print("Continue? ");
        }

        sc.close();
    }
}
