package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(20220001, "장건녕");
        Student student2 = new Student(20220001, "장건녕");

        System.out.println(student);
        System.out.println(student2);

        System.out.println(student == student2); //주소값 비교
        System.out.println(student.equals(student2));

        System.out.println(student.hashCode() == student2.hashCode()); // 출력되는 값은 실제 주소다.
        System.out.println(student2.hashCode());

        Class c = student.getClass(); // 반환 자료형이 Class<>
        System.out.println(c);
        System.out.println(c.getName()); // 패키지 클래스명
        System.out.println(c.getSimpleName()); // 클래스의 이름만

        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        Method[] methods = c.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }
}
