package j13_Object;

import lombok.*;

/*
  정보를 담는 클래스 Entity객체
  정보를 담기 위한 로직을 정리한 클래스
 */
@NoArgsConstructor // 매게변수가 없는 기본 생성자
@AllArgsConstructor // 전체 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 위의 4가지를 한번에 포함한다.

public class Entity {
    private String name;
    private int age;
    private String address;

    public boolean cmp() {
        return this.getClass() == Entity.class; //결과값은 true

    }
}
