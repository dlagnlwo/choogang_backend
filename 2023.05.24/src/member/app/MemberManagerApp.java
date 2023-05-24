package member.app;

import member.controller.MemberController;

public class MemberManagerApp {

	public static void main(String[] args) {
		MemberController controller = new MemberController();
		//회원관리 메뉴 시작
		controller.run();

	}

}
