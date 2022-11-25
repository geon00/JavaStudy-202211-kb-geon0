package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {
        A.B b = new A().new B("geon0"); // A.B = A클래스안에 B클래스를 생성해라 // 내부클래스
        System.out.println(b.getName());
    }
}
