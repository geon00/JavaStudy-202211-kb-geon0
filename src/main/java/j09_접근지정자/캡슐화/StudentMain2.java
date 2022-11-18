package j09_접근지정자.캡슐화;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.setName("장건녕");

        String nameS1 = s1.getName();
        System.out.println(nameS1);

        s1.getSchool();

        String schoolS1 = s1.getSchool();
        System.out.println("방통대");

    }

}
