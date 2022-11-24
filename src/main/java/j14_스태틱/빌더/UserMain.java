package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .username("장건녕")
                .password("1234")
                .email("sdasd@naver.com")
                .name("장건녕")
                .build();

        System.out.println(user);
    }
}
/*
 빌더 패턴의 장점
 1. 내가 원하는 값만 넣을 수 있다.
 2. 순서 상관이 없다.
 */