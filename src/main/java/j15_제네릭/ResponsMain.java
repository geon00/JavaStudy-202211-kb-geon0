package j15_제네릭;

public class ResponsMain {
// <?> 제네릭의 와일드카드
    // <?extends Object> Object를 상속 받은 것들만 가능
    // <?>에서 super는 상위 extends 하위
    public static CMRespDto<?> response(String msg, Object data) { // <?>의미는 여기에 어떤 자료형이 들어올지 모르겠다. 리턴타입에 주로 많이 씀
        return new CMRespDto<>(msg, data); // 자동으로 Object 타입을 잡아준다.
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("geon0")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error", "학번에 오류가 있습니다."));
    }
}
