package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		Gson gson = new Gson(); // Gson의 사용예

		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create(); // .setPrettyPrinting() 예쁘게 만들어준다.

		Map<String, Object> map = new HashMap<>();
		map.put("name", "장건녕");
		map.put("email", "geon0@naver.com");
		map.put("address", "부산광역시 수영구");
		map.put("phone", "01064091959");

		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");

		map.put("hobby", hobby);

		System.out.println(map);

		String json = gson2.toJson(map); // map에 들어있는 값을 json형태로 바꿔주는 코드

		System.out.println(json);

		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class); // json을 Map(객체)으로 바꿔주는 코드

		System.out.println(jsonMap);
	}
}
