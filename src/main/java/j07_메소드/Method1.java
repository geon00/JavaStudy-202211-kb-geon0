package j07_메소드;

public class Method1 {

    public static void method1() {    // 무조건 작성해야한다. // void 공허하다 비어있다. 반환하는 값이 없다라는 말
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매게변수 a:" + a);
        System.out.println();
    }

    public static int max(int a, int b) {   // int를 무조건 반환해야하는 함수
        int result = 0;

        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }

    public static int method3(int a, int b) {
        System.out.println("메소드3 호출");
        System.out.println("매게변수 a:" + a);
        System.out.println("매게변수 b:" + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;
    }

    public static void main(String[] args) {
        method1(); // 메서드 호출, 매게변수를 찾아간다.
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1 = method3(3000, 7000);
        System.out.println("result1: " + result1);
    }

}
