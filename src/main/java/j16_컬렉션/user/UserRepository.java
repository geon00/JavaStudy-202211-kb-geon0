package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UserRepository {

	@Getter
	private List<Map<String, Object>> userList;

	// Create
	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap); // 메서드가 호출될 때 마다 유저가 쌓인다.
	}

	// Read
	public Map<String, Object> findUserByUsername(String username) {
		Map<String, Object> userMap = null;

		for (Map<String, Object> user : userList) {
			String _usernmae = (String) user.get("userName"); // 변수 밑에 _(언더바를 쓰면) 임시로 쓰겠다.
			if (_usernmae.equals(username)) {
				userMap = user;
				break;
			}
		}

		return userMap;
	}

	public void modifyPasswordByUsername(String username, String newPassword) { // 비밀번호를 바꾸는 로직
		Map<String, Object> userMap = findUserByUsername(username);

		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; // void지만 return을 쓰면 강제로 빠져나간다.
		}

		userMap.replace("Password", newPassword);
	}

	public void deleteUserByusername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);

		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; // void지만 return을 쓰면 강제로 빠져나간다.
		}

		int userIndex = userList.indexOf(userMap); // 주소값에 위치하고 있는 인덱스를 찾아준다.
		userList.remove(userIndex);
	}

}
