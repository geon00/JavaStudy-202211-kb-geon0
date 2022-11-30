package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	private static String[] keys;

	public static void main(String[] args) { // map은 순서가 없다.
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("username", "geon0");
		map.put("password", "1512");
		map.put("name", "장건녕");
		map.put("email", "geon0@naver.com");
		map.put("age", 23);
		Map<String, String> address = new TreeMap<>(); // Hash 값이 작은 것 부터 출력 / 메모리에 저장
		map.put("gender", true);

		address.put("address1", "부산광역시");
		address.put("address2", "수영구");
		address.put("address3", "광안해변로");
		address.put("address4", "277번길 35-6");

		map.put("address", address);

		Map<Integer, String> subject = new TreeMap<>(); // Tree는 순서대로 저장된다.
		subject.put(100, "Java"); //
		subject.put(200, "C#");
		subject.put(300, "Python");
		subject.put(401, "Python2");
		subject.put(502, "Python3");
		subject.put(600, "Python4");

		map.put("subject", subject);

		System.out.println(map);

		// 문제1. Python3을 꺼내보자

		System.out.println(((Map<Integer, String>) map.get("subject")).get(401)); // 다운캐스팅

		List<String> hobby = new ArrayList<>();

		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");

		map.put("hobby", hobby);

		System.out.println(((List<String>) map.get("hobby")).get(2));
		System.out.println();

		Set<Entry<String, Object>> userEntry = map.entrySet(); // .entrySet()<>타입으로 Entry를 닮고있다.

		System.out.println(map);
		System.out.println(userEntry);

		Set<String> names = new HashSet<>(); // set은 하나의 값만 map은 k값과 v값이 한쌍
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");

		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}

		for (Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue()); // getKey()는 키 값만 가지고 온다. getValue는 벨류 값만 가지고
		}
		
		System.out.println();
		/* =========================== */

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}

		System.out.println("--------------------");
		System.out.println(map.values()); // map에 들어있는 value의 값만 들고온다.

		for (Object obj : map.values()) {
			System.out.println(obj);
		}

	}
}