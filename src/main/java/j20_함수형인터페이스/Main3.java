package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class Main3 {

	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for (String s : list) {
			consumer.accept(s);
		}
	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("임지현");
		names.add("장건녕");
		names.add("문경원");
		names.add("문승주");
		names.add("고동현");

		names.forEach(n -> { // consumer라는 인터페이스를 받은 후 consumer 객체를 foreach에 전달해 list안에 들어있는 names를 순회한다.
			System.out.println(n);
		});

		System.out.println();

		forEachTest(n -> {
			System.out.println(n);
		}, names);

		Map<String, String> subject = new HashMap<>();

		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javas", "자바스크립트");
		subject.put("C", "씨언어");
		subject.put("Node.js", "노드제이에스");

		Set<String> keySet = subject.keySet();
		keySet.forEach(key -> {

			System.out.println(subject.get(key));
		});

		Set<Entry<String, String>> entrySet = subject.entrySet();
		entrySet.forEach(entry -> {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		});
		
		subject.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
	}
}
