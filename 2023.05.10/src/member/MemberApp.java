package member;

public class MemberApp {

	public static void main(String[] args) {
		
		Member memberObject = new Member();
		memberObject.id = "hanul";
		memberObject.password = "12345";
		memberObject.companyName = "자바";

		Member memberObject1 = new Member();
		memberObject1.id = "bada";
		memberObject1.password = "67890";
		memberObject1.companyName = "스프링";
	}

}
