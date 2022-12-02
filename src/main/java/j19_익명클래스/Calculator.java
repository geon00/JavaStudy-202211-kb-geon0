package j19_익명클래스;

@FunctionalInterface // 추상메서드가 두개 있으면 잘못됫다는 것을 알려준다.
public interface Calculator {

	public int calc(int a, int b); // 추상 메서드
//	public int calc2(int a, int b);

// @FunctionalInterface는 default메서드는 가질 수 있다. 이미 정의가 되어서 가능
	public default int a() {
		return 10;
	}

}
