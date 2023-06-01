package bbs.mariadb;

public class BoardExampleApp {
	public static void main(String[] args) {
		//게시판 관리 클래스 생성
		//생성후에 게시판 목록을 출력
		BoardExample boardExample = new BoardExample();
		boardExample.list();
	}
}
