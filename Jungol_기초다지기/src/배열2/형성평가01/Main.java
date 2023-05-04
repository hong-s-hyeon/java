package 배열2.형성평가01;

/*
승지는 주사위 놀이를 하다가 주사위를 10번 던져서 각 숫자가 몇 번씩 나왔는지 알아보려고 한다.
        한번 던질 때마다 나온 주사위의 숫자를 입력받아서 각 숫자가 몇 번씩 나왔는지 출력하는 프로그램을 작성하시오.


 입력 : 5 6 3 4 5 5 2 2 4 6


 출력
        1 : 0
        2 : 2
        3 : 1
        4 : 2
        5 : 3
        6 : 2
*/


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        tmap.put(1,0);
        tmap.put(2,0);
        tmap.put(3,0);
        tmap.put(4,0);
        tmap.put(5,0);
        tmap.put(6,0);

        int[] dice = new int[10];

        for (int i = 0; i < 10; i++) {
            dice[i] = sc.nextInt();
        }

        for (int a : dice) {
            Integer value = tmap.get(a); // null 때문에
            tmap.put(a, value + 1);

        }

        for (Map.Entry<Integer, Integer> tm: tmap.entrySet()){
            System.out.println(tm.getKey() + " : " + tm.getValue());
        }


            sc.close();
    }
}
