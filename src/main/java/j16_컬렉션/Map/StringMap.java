package j16_컬렉션.Map;
/*
   이클립스 다운 spring io 접속 프로젝트에 4다운 -> 커피 모양 아닐시 jarfix다운 -> 연결프로그램에서 항상 앱을 사용 체크
워크스페이스 폴더 생성 후 런치 -> 프로젝트 폴더 workspace에 옮기기 
롬복 다운 -> 롬복 폴더 툴에 붙여넣기 -> 설치과정 생략 -> maven설정 -> java utf8로 업데이트 -> 폰트 d2 ve로 설정
패키지 정렬
 */
import java.util.HashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();

		language.put("java", "자바");
		language.put("HTML", "에이치티엠엘");
		language.put("CSS", "씨에스에스");
		language.put("JS", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");
		language.put("python", "파이썬?");

		System.out.println(language);

		String s = language.get("java");
		System.out.println(s);

		language.replace("java", "자바2", "자바3");
		System.out.println(language.get("java"));

		language.remove("python2");

		System.out.println(language);
	}

}
