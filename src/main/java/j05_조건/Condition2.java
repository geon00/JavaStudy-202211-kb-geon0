package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else if (score >= 90) {
            System.out.println("A학점 입니다.");
        } else if (score >= 80) {
            System.out.println("B학점 입니다.");
        } else if (score >= 70) {
            System.out.println("C학점 입니다.");
        } else if (score >= 60) {
            System.out.println("D학점 입니다");
        } else {
            System.out.println("F학점 입니다.");
        }

        /*
        점수가 0보다 작거나 100보다 크면 잘못된 점수입니다.
        출력 90~100 A학점 출력
         */
    }
}
