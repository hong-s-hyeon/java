package 함수2.형성평가01;

import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //입력 함수 >> int[] 리턴
        arrangeDescent(inputNum());

        sc.close();
        // arrangeDescent()
    } //main

    private static void arrangeDescent(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] inputNum() {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}// class
