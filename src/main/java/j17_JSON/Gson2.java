package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {

		User user = User.builder()
				.username("geon0")
				.password("1234")
//				.email("geon0@naver.com")
				.build();

		System.out.println(user);

		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls() // null 값인 녀석들을 출력하게 만들어 준다.
				.excludeFieldsWithoutExposeAnnotation() 
				.create();

		String userJson = gson.toJson(user);
		System.out.println(userJson);

		User userObj = null;

		userObj = gson.fromJson(userJson, User.class); // user 객체를 가지겠다.
		System.out.println(userObj);
	}

}
