package j15_제네릭;

import lombok.Getter;

public class Imformation<T> {

    @Getter
    private T target; // T자리에 Student, Teacher가 들어왔다.
    // 제네릭을 사용하면 다운캐스팅의 필요가 없다

    public Imformation(T target) {
        this.target = target;
    }

    public void printInfo() {
        System.out.println(target);
    }
}
