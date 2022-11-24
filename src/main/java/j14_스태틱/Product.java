package j14_스태틱;

import lombok.Data;

/*
  static = 공유영역
  static 메서드는 언제든지 접근이 가능

 */

@Data
public class Product {
    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print() {
        System.out.println(autoIncrement);
        add(10, 20); // add를 사용하기 위해선 메모리 할당을 받거나
    }

    public static int add(int a, int b) { // static을 넣어야 한다.
        return a + b;
    }
}
