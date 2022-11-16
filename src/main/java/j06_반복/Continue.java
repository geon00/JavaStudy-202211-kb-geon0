package j06_반복;

public class Continue {
    public static void main(String[] args) {

        int count = 0;

        while (true) {
            System.out.println("나무를" + count + "번 찍습니다.");
            count++;
            if (count < 10) {
                continue;
            }
            System.out.println("나무가 넘어갑니다.");
            break;
        }
    }
}

// continue는 다음으로 넘어가라는 의미를 가지고 있다.