package j11_상속.동물;

public class Human extends Animal {

    public Human() {
        super(); // super는 상위 객체를 의미한다.
        System.out.println("Human 객체 생성");
    }

    @Override // @붙은 문법 -> 어노테이션 / 재정의된걸 표기하기 위해 사용
    public void move() { // 메서드 재정의(오버라이드)
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }

}
