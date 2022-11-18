package j10_배열;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {

        Random rd = new Random();
        rd.nextInt();

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10) + 1;
        }
        /*
           1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
           2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

            System.out.print(arr[i]);

            if (i != arr.length - 1) { //부정 마지막이 9가 아닐경우 쉼표를 출력한다.
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("총합" + total);
    }
}


