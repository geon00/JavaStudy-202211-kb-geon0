package j15_제네릭;

public class ImformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("geon0")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();

        Imformation<Student> studentImformation
                = new Imformation<Student>(student);

        Imformation<Teacher> teacherImformation
                = new Imformation<Teacher>(teacher);

        Imformation2 i1 = new Imformation2 (student);
        Imformation2 i2 = new Imformation2 (teacher);

        studentImformation.printInfo();
        teacherImformation.printInfo();

        System.out.println("학생이름: " + studentImformation.getTarget().getName());
        System.out.println("학생이름2: " + ((Student)i1.getTarget()).getName());
    }
}
