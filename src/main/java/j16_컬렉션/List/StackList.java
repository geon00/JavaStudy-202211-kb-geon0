package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Scanner;

public class StackList {

    public static void main(String[] args) {

        // 임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현
        // 순서대로 값을 집어 넣고 마지막으로 들어온 값이 먼저 나오게

        ArrayList<String> stack = new ArrayList<String>();

//        stack.add(0, "임지현");
//        stack.add(0, "신경수");
//        stack.add(0, "고희주");
//        stack.add(0, "문승주");
//        stack.add(0, "장건녕");
//        stack.add(0, "박수현");
//        stack.add(0, "황석민");
//        stack.add(0, "박준현");
//
//        for (String name : stack) {
//            System.out.println(name);
//            if (name.equals(stack.get(stack.size() - 1))) {
//                System.out.println("---");
//            }
//        }

        stack.add("임지현");
        stack.add("신경수");
        stack.add("고희주");
        stack.add("문승주");
        stack.add("장건녕");
        stack.add("박수현");
        stack.add("황석민");
        stack.add("박준현");

        ArrayList<String> copyList = new ArrayList<String>();
        int size = stack.size(); // 리무브 할때마다 사이즈가 줄어들어서 고정시킨 후

        for(int i = 0; i < size; i++) {
            copyList.add(0, stack.remove(size - i - 1));
        }
        System.out.println(copyList);

    }
}
