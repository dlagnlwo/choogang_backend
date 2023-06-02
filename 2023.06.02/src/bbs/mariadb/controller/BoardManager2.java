package bbs.mariadb.controller;

import static bbs.mariadb.util.BoardIO.p;
import static bbs.mariadb.util.BoardIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import bbs.mariadb.model.Board;
//실제 게시판을 관리하는 클래스
public class BoardManager2 {
	//멤버변수
	private Scanner sc;
	private Connection conn;
	
	//생성자
	public BoardManager2() {
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
		getConn();
		pl("-------------------------------------------------------");
		
		mainMenu();
	}
	//게시판 메인메뉴
	public void mainMenu() {
		String choice = "";
		pl("");
		pl("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		p("메뉴 선택 : ");
		choice = sc.next();
		switch(choice) {
		case "1" :
			Create();
			break;
		case "2" :
			Read();
			break;
		case "3" :
			Clear();
			break;
		case "4" :
			Exit();
			break;
		default :
			pl("메뉴를 잘못선택하셨습니다.");
			list(); 
			break;
		}
	}
	
	public void Create() {
		Board board = new Board();
		
		pl("");
		pl("[새 게시물 입력]");
		p("제목: ");
		board.setBtitle(sc.next());
		
		p("내용: ");
		board.setBcontent(sc.next());
		
		p("작성자: ");
		board.setBwriter(sc.next());
		
		pl("-------------------------------------------------------");
		pl("보조 메뉴: 1.OK | 2.Cancel");
		p("메뉴 선택: ");
		String choice = sc.next();
		if(choice.equals("1")) {
			try {
				
				getConn();
				String inserSql = 	"""
									insert into board
									(btitle, bcontent, bwriter, bdate)
									values (?,?,?,now());
									""";
				PreparedStatement pstmt = conn.prepareStatement(inserSql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else if(choice.equals("2")) {
			pl("취소를 선택하셨습니다.");
			list();
		}
		
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
	public Connection getConn() {
		final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		Connection conn = null;
		try {
			Class.forName(MYSQL_DRIVER);
			
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			
			select(conn);
		}catch (Exception e) {
			
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
		return conn;
	}
	public ResultSet select(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String selectSql = """
						select bno, btitle, bcontent, bwriter, bdate
						from boards
						ORDER BY bno DESC;
						""";
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				
				System.out.printf("%-6s%-12s%-16s%-40s",
						board.getBno(),
						board.getBtitle(),
						board.getBcontent(),
						board.getBwriter(),
						board.getBdate());
			}
			
			rs.close();
			pstmt.close();
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
		return rs;
	}
}
