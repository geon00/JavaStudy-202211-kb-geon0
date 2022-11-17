package j08_클래스;

public class Phone {
    /*
    new는 무조건 메모리 할당
     */

    String company;
    String model;

    Phone() {
    }

    Phone(String c, String m) { //생성자: 리턴값, 반환 자료형이 없다. 대문자로 시작
        company = c; //생성자 오버로딩
        model = m;

    }

    void printPhoneCompany() {
        System.out.println("제조사:" + company);
        System.out.println();
    }

    void printPhoneModel() {
        System.out.println("모델명:" + model);
        System.out.println();
    }

}

