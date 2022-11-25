package j15_제네릭;

import lombok.Getter;

public class Imformation2<T> {

    @Getter
    private Object target;

    public Imformation2(Object target) {
        this.target = target;
    }

    public void printInfo() {
        System.out.println(target);
    }
}

