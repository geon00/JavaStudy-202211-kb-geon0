package j07_메소드;

public class Method2 {

    /*
           메소드 오버로딩
           메게변수의 자료형이 틀리면 같은 명이라도 쓸 수 있다.
           메소드 명은 따로 구분
     */
    public static void print(String name) {
        System.out.println("이름:" + name);
    }

    public static void print(int age) {
        System.out.println("나이:" + age);
    }

    public static void print(String name, int age) {
        System.out.println("이름:" + name + " 나이:" + age);
    }

    public static void print(int age, String name) {
        System.out.println("이름:" + name + " 나이:" + age);
    }


    public static void main(String[] args) {

        print("장건녕");
        print(23);
        print("장건녕", 23);
        print(23, "장건녕");
    }
}
