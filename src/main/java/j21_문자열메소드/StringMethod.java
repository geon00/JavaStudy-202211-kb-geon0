package j21_문자열메소드;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String name = "장건녕장건영";
		
		System.out.println(name.length()); // 메소드를 통해 문자열의 길이를 가져올 수 있다.
		
		// 문자의 위치 찾기(인덱스 번호)
		System.out.println(name.indexOf("장"));
		System.out.println(name.indexOf("건"));
		
		// 뒤에서 부터 문자의 위치 찾기
		System.out.println(name.lastIndexOf("장"));
		
		char name1 = name.charAt(0); // 리턴자료형이 char타입
	    System.out.println(name1);
	    
	    char name2 = name.charAt(name.indexOf("건"));
	    System.out.println(name2);
	    
	    // 문자열을 자르는 코드
	    String subName1 = name.substring(0, 3);	    
	    String subName2 = name.substring(3);
	    System.out.println(subName1);
	    System.out.println(subName2);
	    
	    System.out.println("---------좋은코드---------");
	    
	    String namegeon0 = "장건녕"; 
	    
	    // 글자의 길이에 따라서 잘라줄 수 있다.
	    System.out.println(name.substring(name.indexOf(namegeon0), name.indexOf(namegeon0) + namegeon0.length()));
		
	    System.out.println("-----응용문제-----");
	    
	    String file = "C:/String.java";
	    String fileName = null;
	    String extention = null;
	    
	    // "C:/".length() 여기서 부터 찾아라
	    fileName = file.substring("C:/".length(), file.lastIndexOf("."));
	    System.out.println(fileName);
	    
	    extention = file.substring(file.lastIndexOf("."));
	    System.out.println(extention);
	    
	}

}
