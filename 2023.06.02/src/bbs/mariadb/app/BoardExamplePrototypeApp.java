package bbs.mariadb.app;

import static bbs.mariadb.util.BoardIO.pl;

import java.sql.Connection;

import bbs.mariadb.controller.BoardManager4;

public class BoardExamplePrototypeApp {
	public static void main(String[] args) {
		Connection conn = null;
//		BoardManager2 manager = new BoardManager2();
//		manager.list();
		BoardManager4 manager3 = new BoardManager4();
		manager3.list();
		
		/* # main() 메소드 종료 :
		 * 메인 쓰레드 종료
		 * 일반적으로 메인쓰레드가 종료하면 프로그램이 종료된다.
		 * 쓰레드란 프로그램의 처리흐름을 말한다
		 * 프로그램을 실행하면 운영체제가 프로세스라고 하는 처리 흐름을 만든다.
		 * 프로세스는 CPU의 작업과 메모리를 할당받아 프로그램의 코드를 한줄씩 실행한다.
		 * 이때 프로세스의 프로그램코드를 실행하는 하나의 실행흐름을 쓰레드라고 한다.
		 * 이 쓰레드를 자바에서는 메인쓰레드라고 부릅니다.
		 * 하지만 메인쓰레드만 가지고 모든 일을 처리할 수 없습니다.
		 * 엑셀처럼 계산하는 부분과 화면에 그래프를 그리는 부분, 파일을 인쇄하는
		 * 부분처럼 메인쓰레드와 작업쓰레드를 UI쓰레드라고 한다.
		 * 엑셀 프로그램을 실행한 흐름이 메인쓰레드
		 * 표를 계산하는 흐름이 시간이 제일 많이 걸리므로 작업쓰레드
		 * 프린트를 인쇄하는 경우에도 별도로 출력하고 있으므로 작업쓰레드
		 * 화면에 그래프를 그리는 부분은 끊김이 없이 일정순간마다 새로 그려져야 한다.
		 * 이런 작업흐름을 UI쓰레드 라고 한다. 
		 */

		pl("===3333 메인 프로그램을 마칩니다. ===333");
	}
}
