package song.manage;

import static song.util.MyIO.*;

import java.util.Scanner;

import song.domain.SongDAO;

public class SongManager {
	
	SongDAO songdao;
	Scanner sc;
	int choiceMenuItem;
	boolean isRun;
	
	
	public SongManager(){
		songdao = new SongDAO(); //db연결
		sc = new Scanner(System.in);
		choiceMenuItem = -1;
		isRun = true;
	}

	//메소드
	//노래제목 보여주기
	public void showTitle() {
		pl("#### 노래 관리 프로그램 ####");
	}
	
	//메뉴 보여주기
	public void showMenu() {
		pl("1. 노래목록 || 2. 노래추가 || 3. 노래수정 || 4.노래삭제 || 5.노래종료");
		pl("");
	}
	
	//메뉴 하나 선택
	public void choiceMenuItem() {
		songdao.getConn();
		p("메뉴를 선택하세요(숫자입력) : ");
		choiceMenuItem = sc.nextInt();
		switch(choiceMenuItem) {
		
		case 1:
			songdao.seleceSong();
			break;
		case 2:
			songdao.insertSong();
			break;
		case 3:
			songdao.updateSong();
			break;
		case 4:
			songdao.deleteSong();
			break;
		case 5:
			songdao.close();
			isRun = false;
			p("노래프로그램 종료");
			break;
		}
	}
	
	//선택한 메뉴의 기능을 실행
	public void processMenuItem() {
		
	}
	public void run() {
		while(isRun) {
			showTitle();
			showMenu();
			choiceMenuItem();
			processMenuItem();
		}
		sc.close();
	}
}
