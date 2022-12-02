package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("임지현");
		names.add("문경원");
		names.add("문승주");
		names.add("고동현");
		
		Supplier<String> firstName = () -> names.get(0); 
			
		System.out.println(firstName.get());
		
	}
}
