package j18_예외;

public class ThrowsException {

	public static void printArray(int[] numbers) throws Exception { // throws Exception는 이 메서드에서 예외가 일어날 수 있다.
		for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) { // main에서 throws Exception로 예외를 미루면 jbm까지 간다.
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		
		try {
			printArray(nums);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
