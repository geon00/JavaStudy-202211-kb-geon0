package j16_컬렉션.Set;
/*
 * set에서의 업데이트는 삭제도 동시에 한다.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("장건녕");
		nameSet.add("문승주");
		nameSet.add("문경원");
		nameSet.add("임지현");
		nameSet.add("고동현");

		System.out.println(nameSet); // set은 하나의 값을 꺼내올 수 없다.

		for (String s : nameSet) {
			if (s.equals("장건녕")) { // set은 foreach를 사용해 값을 비교하여 가져온다.
				System.out.println(s);
				break;
			}
		}

		List<String> nameList = Arrays.asList(new String[] { "김준일", "권용범" }); //List를 set로 옮기고 싶으면 addAll을 사용한다.

		System.out.println(nameList);

		Set<String> ListToSet = new HashSet<String>(); // Map은 컬렉션 인터페이스를 상속받지 않는다.
		ListToSet.addAll(nameList);

		System.out.println(ListToSet);
		
		nameSet.remove("장건녕");
		
		System.out.println(nameSet);
		
		
	}
}