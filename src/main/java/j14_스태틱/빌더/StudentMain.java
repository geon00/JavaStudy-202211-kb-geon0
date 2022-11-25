package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .name("장건녕")
                .address("부산 수영구")
                .studentCode(20220001)
                .build(); // 클래스 객체를 만들어준다

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder(); // 바로 접근해서 생성이 가능


    }
}
