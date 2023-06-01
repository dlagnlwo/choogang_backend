package bbs.mariadb;

import static bbs.util.bbsIO.*;

import java.util.Scanner;

import bbs.DTO.BoardDTO;
public class BoardExample2 {
	
	//멤버변수
	BoardDTO boarddot;
	Scanner sc;
	
	//생성자
	public BoardExample2() {
		boarddot = new BoardDTO();
		sc = new Scanner(System.in);
	}
	
	//메소드
	public void list() {
		pl("");
		pl("[게시판 목록]");
		pl("--------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n",
				"no", "writer", "date", "title");
		pl("--------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n",
				"1", "winter", "2022.01.27", 
				"게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n",
				"2", "winter", "2022.01.27", 
				"겨울입니다");
		System.out.printf("%-6s%-12s%-16s%-40s\n",
				"3", "summer", "2022.06.01", 
				"현재는 여름입니다.");
		mainMenu();
	}
	public void mainMenu() {
		int choice = 0;
		boolean isRun = true;
		pl("");
		pl("메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		p("메뉴선택 : ");
		choice = sc.nextInt();
			switch(choice) {
			case 1 :
				Create();
				break;
			case 2 :
				Read();
				break;
			case 3 :
				Clear();
				break;
			case 4 :
				Exit();
				break;
			}
	}
	public void Create() {
		pl("*** create() 메소드가 실행됨.");
		System.exit(0);
	}
	public void Read() {
		pl("*** read() 메소드 실행됨");
	}
	public void Clear() {
		pl("*** clear() 메소드 실행됨");
	}
	public void Exit() {
		pl("*** exit() 메소드 실행됨");
		pl("종료되었습니다.");
		System.exit(0);
	}
}
