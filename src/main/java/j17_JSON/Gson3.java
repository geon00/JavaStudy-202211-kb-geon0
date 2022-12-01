package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("username", "Geon0");
		jsonObject.addProperty("password", "1234");
		
		System.out.println(jsonObject);
		
		JsonArray jsonArray = new JsonArray(); // json배열
		jsonArray.add("java");
		jsonArray.add("Python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		
		System.out.println(jsonObject);
			
			
	}

}
