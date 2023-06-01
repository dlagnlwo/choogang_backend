package bbs.mariadb;

import static bbs.util.bbsIO.*;

import java.util.Scanner;

import bbs.DTO.BoardDTO;
public class BoardExample {
	
	//멤버변수
	BoardExample2 be2;
	
	//생성자
	public BoardExample() {
		be2 = new BoardExample2();
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
		be2.mainMenu();
	}
	
}
