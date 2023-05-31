package mariadb;

import lombok.Data;

//@Data는 롬복 라이브러리
@Data //Constructor, Getter, Setter, 
	  //hashCode(), equals(), toString() 자동 생성

public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;

	
}
