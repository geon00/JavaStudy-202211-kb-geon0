package j13_Object;

import java.util.Objects; // 오브젝트 클래스는 최상위 클래스이며 모든 클래스는 오브젝트 클래스를 상속 받는다.

public class StringTest {

    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2); // true
        System.out.println(str.equals(str2)); // true // 문자열을 비교할 때는 .equals를 사용한다.

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3); // false

        System.out.println(str.toString()); // toString()은 동일한 주소값을 리턴한다.

    }
}
