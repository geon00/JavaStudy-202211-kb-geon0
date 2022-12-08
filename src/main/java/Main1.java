class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
}

public class Main1 {
	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		
		int a = 10;
		int b = 20;
		int c = 200;
		int d = 100;
		
		int i = cl.add(a, b);
		int j = cl.sub(c, d);
		
		System.out.println(i);
		System.out.println(j);
	}

}
