package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		
		String phone1 = "010-6409/1959";
		String phone2 = "010.6409/1959";
		String phone3 = "010 6409/1959";
		String phone4 = "010-6409 1959";
		
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));
		
		System.out.println(phone1.replaceAll("-", "")); // 문자열안에 -를 공백으로 바꿔라는 코드
		
	}

}
