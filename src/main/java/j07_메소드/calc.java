package j07_메소드;

public class calc {
    /*

    1. add(덧셈) -> return int, parameter int x, int y
    2. sub(뺄셈)
    3. mul(곱셈)
    4. div(나눗셈)
    5. mod(나머지)

     */

    public static int add(int x, int y) { //매게변수 안에 int a, b의 값이 들어간다.
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int addResult = add(a, b);
        int subResult = sub(a, b);
        int mulResult = mul(a, b);
        int divResult = div(a, b);
        int modResult = mod(a, b);

        System.out.println("a + b =" + addResult);
        System.out.println("a - b =" + subResult);
        System.out.println("a * b =" + mulResult);
        System.out.println("a / b =" + divResult);
        System.out.println("a % b =" + modResult);

    }
}

//메서드 핵심: 반복적이고 재사용적인 로직을 묶어놓은 것
//하나의 코드에 값만 바뀌는 것 입/출력