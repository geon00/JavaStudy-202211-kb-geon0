package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;


/*
 * serialize (Object -> Json) 변경
 * deserialize (Json -> Object) 변경 변환이 될 때 값을 포함할건지 말건지
 */

@Builder
@Data
public class User {
	
	@Expose(serialize = true, deserialize = true) 
	private String password;
	@Expose(serialize = false, deserialize = false)
	private String username;
	@Expose(serialize = true, deserialize = false) 
	private String name;
	@Expose(serialize = true, deserialize = true) 
	private String email;
}
