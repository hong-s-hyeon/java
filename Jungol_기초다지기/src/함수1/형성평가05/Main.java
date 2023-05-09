package 함수1.형성평가05;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        int[] aArr = changeInt(a);
        int[] bArr = changeInt(b);
        int[] cArr = changeInt(c);

        calcTot(aArr);
        calcTot(bArr);
        calcTot(cArr);
        calcTotSubject(aArr, bArr, cArr);

        sc.close();
    }

    private static void calcTotSubject(int[] aArr, int[] bArr, int[] cArr) {
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = 0;
            num = aArr[i] + bArr[i] + cArr[i];
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println(sum);
    }

    private static void calcTot(int[] aArr) {
        int sum = 0;
        for (int i = 0; i < aArr.length; i++) {
            System.out.print(aArr[i]+ " ");
            sum += aArr[i];
        }
        System.out.println(sum);
    }

    private static int[] changeInt(String a) {
        String[] arr = a.split(" ");
        int[] arrInt = new int[3];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        return arrInt;
    }


}
