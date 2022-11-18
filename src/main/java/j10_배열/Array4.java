package j10_배열;

import java.util.Random;

public class Array4 {
    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[10];
        int total = 0;

        //배열에 랜덤한 값 대입
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                int rdNumber = rd.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == rdNumber) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    arr[i] = rdNumber;
                    break;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

            System.out.print(arr[i]);

            if (i != arr.length - 1) { //부정 마지막이 9가 아닐경우 쉼표를 출력한다.
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("총합" + total);

        System.out.println("최소값:" + foundMinNumber(arr));
        System.out.println("최대값: " + foundMaxNumber(arr));

    }
}

/*
   주말 문제

   1. 두개 배열 중 겹치면서 제일 작은 값과 겹치면서 제일 큰 값을 출력
 */


