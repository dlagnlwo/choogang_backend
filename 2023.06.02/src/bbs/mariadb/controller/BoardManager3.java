package bbs.mariadb.controller;

import static bbs.mariadb.util.BoardIO.p;
import static bbs.mariadb.util.BoardIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.border.Border;

import bbs.mariadb.model.Board;
//실제 게시판을 관리하는 클래스
public class BoardManager3 {
	//멤버변수
	private Scanner sc;
	private Connection conn; //전체에서 사용해야되기 때문에
	
	//멤버상수
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
	private final String USER = "root";
	private final String PASS = "mariadb";
	
	//Connection은 속성함수로 쓰는게 제일 좋음.
	//생성자
	public BoardManager3() {
		createConnection(); //연결메소드를 만든 후 생성자에 집어넣어야됨!!!!
							//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sc = new Scanner(System.in);
	}
	//연결
	public void createConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
			//여기서 conn.close()하면 안됨!!!!!!!!!!!!!!!!!!!!!!
		}catch (Exception e) {
			
		}
	}
	
	
	
	//게시판 목록
	public void list() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pl("");
		pl(">>> [게시판 목록] <<<");
		pl("");
		pl("-------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s", "no", "writer", "date", "title");
		pl("-------------------------------------------------------");
		String selectSql = 	"""
							select bno, btitle, bcontent,
								   bwriter, bdate
							from boards
							order by bno desc;
							""";
		try {
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
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public void select() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = 	"""
				select bno, btitle, bcontent,
					   bwriter, bdate
				from boards
				order by bno desc;
				""";
		try {
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
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update() {
		Board board = new Board();
		PreparedStatement pstmt = null;
		String updateSql = 	"""
							update boards
							set btitle = ?,
								bcontent = ?,
								bwriter = ?
							where bno = ?;
							""";
		try {
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setInt(4, board.getBno());
			pstmt.executeUpdate();
			
			pstmt.close();
		}catch (Exception e) {
			
		}
	}
}
