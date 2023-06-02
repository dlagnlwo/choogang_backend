package bbs.mariadb.controller;

import static bbs.mariadb.util.BoardIO.p;
import static bbs.mariadb.util.BoardIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
//실제 게시판을 관리하는 클래스
public class BoardManager {
	//멤버변수
	Scanner sc;
	//생성자
	public BoardManager() {
		sc = new Scanner(System.in);
	}
	
	
	
	//게시판 목록
	public void list() {
		pl("");
		pl(">>> [게시판 목록] <<<");
		pl("");
		pl("-------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s", "no", "writer", "date", "title");
		pl("-------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s", 
				"1", "봄", "2022-05-30", "봄입니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n", 
				"2", "겨울", "2023-01-27", "올 겨울은 많이 춥습니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n", 
				"3", "여름", "2022-06-02", "올 여름은 비가 많이 옵니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n", 
				"4", "가을", "2022-10-27", "가을입니다.");
		pl("-------------------------------------------------------");
		mainMenu();
	}
	//게시판 메인메뉴
	public void mainMenu() {
		int choice = 0;
		pl("");
		pl("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		p("메뉴 선택 : ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 :
			Create();
			list();
			break;
		case 2 : 
			Read();
			list();
			break;
		case 3 :
			Clear();
			list();
			break;
		case 4 :
			Exit();
			break;
		}
	}
	
	public void Create() {
		pl("Create메소드가 실행");
		list();
	}
	public void Read() {
		pl("Read메소드가 실행");
		list();
	}
	public void Clear() {
		pl("Clear메소드가 실행");
		list();
	}
	public void Exit() {
		pl("프로그램 종료");
		System.exit(0);
	}
}
