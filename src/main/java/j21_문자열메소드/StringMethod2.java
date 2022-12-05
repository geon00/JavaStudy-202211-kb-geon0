package j21_문자열메소드;

public class StringMethod2 {
	public static void main(String[] args) {
		
		//문자열을 배열로 만드는 코드
		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles; // tempRoles를 자른다.
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length()); // 인덱스 번호부터 ,를 찾아서 자른다.
		tempRoles = tempRoles.substring(tempRoles.indexOf(",")+ 2); // ,위치를 찾아서 +2만큼 자른 후 tempRoles안에 넣겠다.
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",")+ 2);
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",")+ 2);
		
		for(String role : roleArray) {
			System.out.println(role);
		
		}
		
		// 위의 문제를 짧게 요약한 코드
		String[] roleArray2 = roles.split(", "); // ,를 기준으로 잘라서 배열로 만들라는 코드
		for(String role : roleArray2) {
			System.out.println(role);
		}
	}

}
