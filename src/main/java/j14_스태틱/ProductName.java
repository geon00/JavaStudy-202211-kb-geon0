package j14_스태틱;

import j07_메소드.Method1;

public class ProductName {

    public void show() { // static이 없으면 show를 호출할 수 없다.
        System.out.println("메인메소드에서 호출");
    }

    public static void main(String[] args) {
        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print();

        ProductName pn = new ProductName(); // show를 호출하기 위해선 메모리 할당을 받아야 한다. (new 생성)
        pn.show();

        Method1.main(null); // 생성없이 다른 클래스도 접근 가능
        Method1.method1();
    }
}