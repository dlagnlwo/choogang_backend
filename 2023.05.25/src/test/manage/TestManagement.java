package test.manage;

import java.util.Scanner;

import test.dao.TestDAO;

import static test.util.TestUtil.*;

//메뉴를 만드는 컨트롤러
public class TestManagement {
	//멤버변수
	TestDAO testdao;
	Scanner sc;
	int choiceCount;
	boolean isRun;
	
	//생성자
	public TestManagement() {
		testdao = new TestDAO();
		sc = new Scanner(System.in);
		choiceCount = -1;
		isRun = true;
	}
	
	
	//메소드
	
	public void showTest() {
		pl("##### 메뉴 ##### \n");
		pl("1. 목록 || 2. 추가 || 3. 수정 || 4. 삭제 || 5. 종료 \n");
	}
	
	public void selectTest() {
		p("메뉴를 입력하세요.(숫자입력) : ");
		choiceCount = sc.nextInt();
		switch(choiceCount) {
		case 1 :
			testdao.selectTest();
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
			p("프로그램이 종료됩니다.");
			break;
		}
	}
	
	public void run() {
		while(isRun) {
			showTest();
			selectTest();
		}
		sc.close();
	}
	
	
}
