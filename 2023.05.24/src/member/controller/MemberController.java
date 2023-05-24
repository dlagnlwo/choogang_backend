package member.controller;

import java.util.Scanner;

import member.memberdao.MemberDAO;
import static member.util.MemberUtil.*;

/*
 * 실질적인 Member관리 클래스
 * MemberApp에서 이 객체를 생성하면
 * 메뉴를 선택하여 MemberDAO객체를 생성하고
 * 해당 기능을 MemberDAO.메소드를 호출
 * 필요하면 MemberVO객체에 데이터를 추가하거나
 * MemberVO객체의 내용을 MariaDB에 보냄.
 * 기본 무한루프를 돌면서 프로그램을 종료하기 전까지
 * 선택한 메뉴를 실행합니다.
 */
public class MemberController {

	// 멤버변수
	// MariaDB와 상호작용할 모델객체 MemberDAO
	private MemberDAO memberDAO;
	// 키보드로부터 메뉴번호를 선택하기 위한 클래스 Scanner
	private Scanner sc;
	// 프로그램 종료
	private boolean isRun;

	
	// 생성자
	public MemberController() {
		// 외부로부터 초기화할 내용이 딱히 필요 없으므로 메뉴를 불러내기위한
		// MemberDAO와 Scanner를 초기화
		memberDAO = new MemberDAO();
		sc = new Scanner(System.in);
		isRun = true;
	}
	
	// 메소드	
	// 메뉴를 보여주는 기능 : showMenu()
	public void showMenu() {
		pl("(●'◡'●) 회원관리 v0.1");
		pl("");
		pl("1. 목록");
		pl("2. 등록");
		pl("3. 수정");
		pl("4. 삭제");
		pl("5. 종료");
		pl("");
		p("번호를 선택해 주세요 : ");
	}
	
	// 메뉴를 선택실행하는 기능 : selectMenu()
	public void selectMenu() {
		int choice = sc.nextInt();
		switch(choice) {
		//멤버목록
		case 1 :
			memberDAO.getMemberList();
			break;
		//멤버추가
		case 2 :
			memberDAO.insertMember();
			break;
		//멤버수정
		case 3 :
			memberDAO.updateMember();
			break;
		//멤버삭제
		case 4 :
			memberDAO.deleteMember();
			break;
		//종료
		case 5 :
			isRun = false;
			p("종료되었습니다.");
			break;
		}
	}
	// 메뉴를 계속 보여주는 무한루프 틀 : run()
	public void run() {
		while(isRun == true) {
			showMenu();
			selectMenu();
		}
		sc.close();
	}
	
	

}
