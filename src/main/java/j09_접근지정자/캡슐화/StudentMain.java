package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("장건녕", "남");
        s1.printInfo();

        s1.setName("geon0");
        s1.printInfo();

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender);
        System.out.println(s1.getName());

    }

}
