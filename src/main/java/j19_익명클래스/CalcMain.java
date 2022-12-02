package j19_익명클래스; // 이름이 없는 클래스를 의미

public class CalcMain {

	public static void main(String[] args) {

		Calculator c = new Calculator() {
			@Override
			public int calc(int a, int b) { // 오버라이드는 매게변수명을 바꿀 수 있다. 메서드명, 자료형 빼고
				return a + b;
			}
		};
		
		// 람다의 조건: 인터페이스 내부에 추상 메소드가 하나만 있어야 한다.
		// 람다는 항상 대상이 있어야 한다 예) Calculator
		// 람다 식의 특징: 자료형을 매게변수로 주지 않아도 된다, 리턴 생략이 가능, 중괄호 생략 가능 단 중간에 다른 실행문이 없는 경우
		// x, y는 매게변수를 정의 | 정의밖에 없다.
		Calculator c1 = (x, y) -> x + y;
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);

		Calculator c2 = new Addition();

		int r2 = c2.calc(20, 30);
		System.out.println(r2);

	}

}
