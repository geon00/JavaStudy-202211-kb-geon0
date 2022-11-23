package j13_Object;

import java.util.Objects;

public class Student {

    private  int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override // 새로운 주소를 정의한다.
    public boolean equals(Object o) { // 재정의 할 때는 매게변수는 바꿀 수 있다.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name);
    } // Objects는 객체들을 다양하게 사용할 수 있는 유틸리티

    @Override // 주소값으로 쓰는 용도는 아님
    public int hashCode() {
        return Objects.hash(code, name);
    } // hashcode는 데이터 값을 합쳐서 만든 코드

    @Override
    public String toString() { // toString재정의
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';     // Alt + ins 키
    }
}
