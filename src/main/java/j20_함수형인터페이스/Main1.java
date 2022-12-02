package j20_함수형인터페이스;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;

		// 매게변수가 하나일 경우 괄호 생략가능
		Runnable application1 = () -> { // 메서드 안에서 메서드를 정의했다.
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);
		};

		application1.run();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
		for (int i = 0; i < 100; i++) {
			try {
				System.out.println("알림기능");
				System.out.println(i + " : " + (i + 1));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});

		t1.start();
		t2.start(); // 비동기처리 

	}
}
