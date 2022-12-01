package j18_예외;

public class ArrayException {

	public static void main(String[] args) {
		Integer[] numberArray = new Integer[] { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(numberArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // try안에서 예외가 발생하면 catch로 매게변수를 던져준다.
			System.out.println(e); // 예외 이유가 뭔지 알려줌
			e.printStackTrace(); // 이 예외가 가지고 있는 문제점을 출력해준다. 
			System.out.println(e.getMessage()); // 문제점의 메시지만 가지고 올 수 있다.
			System.out.println("예외가 생성됨"); // 어떤 문제가 있는지 알면서 프로그램은 종료되지 않는다.
		}
		
		System.out.println("프로그램 정상 종료");

	}

}
