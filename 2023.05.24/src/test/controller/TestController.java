package test.controller;

import java.util.Scanner;

import static test.util.testUtil.*;
import test.testdao.TestDAO;


//컨트롤러는 메뉴선택 클래스
public class TestController {
	//멤버변수
	private TestDAO testdao;
	private Scanner sc;
	private boolean isRun;
	
	//생성자는 기본생성자 하나만 만듬
	public TestController() {
		testdao = new TestDAO();
		sc = new Scanner(System.in);
		isRun = true;
	}
	
	//메소드
	//showView()
	public void showView() {
		pl("회원관리 목록\n");
		pl("1. 목록");
		pl("2. 등록");
		pl("3. 수정");
		pl("4. 삭제");
		pl("5. 종료\n");
		p("번호를 선택해 주세요 : ");
	}
	//selectMenu()
	public void selectMenu() {
		int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				testdao.getTestList();
				break;
			case 2 :
				testdao.insertTest();
				break;
			case 3 :
				testdao.updateTest();
				break;
			case 4 :
				testdao.deleteTest();
				break;
			case 5 :
				isRun = false;
				p("종료되었습니다.");
				break;
			}
		}
	
	
	//run()
	public void run() {
		while(isRun) {
			showView();
			selectMenu();
		}
		sc.close();
	}
	
}
