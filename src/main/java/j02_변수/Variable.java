package j02_변수;

/**
 * 클래스에 대한 설명
 */

public class Variable {

    /**
     * 메소드에 대한 설명
     */

    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형: " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형: " + checkFlag);

        char name1 ='장';
        char name2 = '건';
        System.out.println(name1 + name2);
        System.out.println(Integer.toHexString(name1));
        System.out.println("\uae40");

        int width1 = 100;
        int width2 = 200;

        System.out.println(width1+width2);

        String sWidth1 = "100";
        String sWidth2 = "200";

        System.out.println(sWidth1+sWidth2);

        double dNum = 2.1;
        double dNum2 = 3.5;

        System.out.println(dNum + dNum2);

        System.out.println("<<<<< 형변환 >>>>>");

        // 업 캐스팅
        // 문자 > 정수 > 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int) c1) + 10);
        int n1 = (int) c1; //회색처리는 생략해도된다.
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);

        // 다운 캐스팅
        // 실수 > 정수 > 문자
        int n2 = (int) d1;
        System.out.println(n2);

        char c2 = (char) n2;
        System.out.println(c2);

    }
    }

