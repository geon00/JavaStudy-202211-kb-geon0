package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

/*

 */

@AllArgsConstructor // 전체 생성자 (모든 매게변수가 있는)
@ToString
public class Student { // 빌더의 특징 변수가 클래스에 똑같이 들어간다.
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder { // 내부 클래스, 생성하지 않아도 접근할 수 있는 클래스C
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this; // 자기 자신의 주소를 리턴
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this; // 자기 자신의 주소를 리턴
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this; // 자기 자신의 주소를 리턴
        }

        public Student build() { // Student를 리턴하는 빌더
            return new Student(studentCode, name, address);
        }
    }

}
