package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("부산대학교", "장건녕", 3, false);

        student.school = "부산대학교";
        student.name = "장건녕";
        student.studentYear = 3;
        student.gender =  true;

        student.showStudentInfo();

        student2.showStudentInfo();


    }
}
