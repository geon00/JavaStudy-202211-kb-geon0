package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        // 일반 반복
        System.out.println("<<<<<<<< 일반반복 >>>>>>>");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]); // 인덱스가 필요할 때는 일반 반복을 사용
        }

        System.out.println();

        // foreach 반복, 모든 컬렉션과 배열에서도 사용 가능
        System.out.println("<<<<<<<< foreach >>>>>>>");
        for (String str : strArray) { // 데이터의 집합이랑 같은 자료형
            System.out.println(str); // 값만 필요할 때는 향상된 for문 사용
        }

        ArrayList<String> strList = new ArrayList<String>(); // 공간의 초기값
        //리스트는 자동으로 1.5배 공간을 늘린다.
        // 값 추가(create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("Jsp");
        strList.add("Servlet");
        strList.add(1, "C++"); // add는 추가해라 라는 의미, 1인덱스 밑으로 들어간다. / 공간은 자동으로 늘림
        strList.add(0, "HTML");

        System.out.println("<<<< List foreach >>>>");
        for (String str : strList) {
            System.out.println(str);
        }

        // 값 조회(Read) -> get(index)
        System.out.println("<<<< List 일반 반복 >>>>");
        for( int i = 0; i < strList.size(); i++) { // length가 아닌 size로
            System.out.println(strList.get(i)); // 키 값이 있다면 get이 웬만해선 다 있다.
        }

        // 값 수정(Update) -> set(intdex, 값)
        strList.set(0, "HTML5");
        System.out.println(strList);

        // 값 삭제(Delete) -> remove(index);
        String removeDate = strList.remove(2);
        System.out.println(removeDate);
        System.out.println(strList);

    }
}
