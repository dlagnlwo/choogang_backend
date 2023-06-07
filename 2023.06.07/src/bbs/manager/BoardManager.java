package bbs.manager;

import static bbs.util.BoardIO.p;
import static bbs.util.BoardIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import bbs.model.BoardDTO;

public class BoardManager {
	//멤버변수
	Connection conn;
	Scanner sc;
	
	//멤버상수
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
	private final String USER = "root";
	private final String PASS = "mariadb";
	
	//생성자
	public BoardManager() {
		sc = new Scanner(System.in);
		getConn();
	}
	
	//메소드
	//연결
	public void getConn() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
		}catch (Exception e) {
			
		}
	}
	public void list() {
		pl("[게시물 목록]");
		pl("----------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", 
					"no", "writer", "date", "title");
		pl("----------------------------------------------");
		
		select();
		
		pl("");
		pl("----------------------------------------------");
		pl("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		p("메뉴 선택: ");
		String choice = sc.nextLine();
		switch(choice) {
		case "1" :
			create1();
			break;
		case "2" :
			read1();
			break;
		case "3" :
			clear1();
			break;
		case "4" :
			exit();
			break;
		default :
			pl("잘못입력하셨습니다.");
			break;
		}
	}
	public void create1() {
		BoardDTO board = new BoardDTO();
		pl("");
		pl("[새 게시물 입력]");
		p("제목: ");
		board.setBtitle(sc.nextLine());
		p("내용: ");
		board.setBcontetn(sc.nextLine());
		p("작성자: ");
		board.setBwriter(sc.nextLine());
		pl("----------------------------------------------");
		pl("보조 메뉴: 1.OK | 2.Cancel");
		p("메뉴 선택: ");
		String choice = sc.nextLine();
		
		if(choice.equals("1")) {
			insert(board);
			list();
		}else if(choice.equals("2")) {
			pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}else {
			pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}
	}
	public void read1() {
		BoardDTO board = new BoardDTO();
		pl("");
		pl("[게시물 읽기]");
		p("bno: ");
		int bno = Integer.parseInt(sc.nextLine());
		
		try {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String selectSql = 	"""
								select bno, btitle, bcontent,
								bwriter, bdate
								from boards
								where bno = ?;
								""";
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontetn(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				pl("#################");
				pl("번호: " + board.getBno());
				pl("제목: " + board.getBtitle());
				pl("내용: " + board.getBcontetn());
				pl("작성자: " + board.getBwriter());
				pl("날짜: " + board.getBdate());
				pl("#################");
			}
			pl("----------------------------------------------");
			pl("보조 메뉴: 1. Update | 2.Delete | 3.List");
			p("메뉴 선택: ");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				update(board);
			}else if(choice.equals("2")) {
				delete(board);
			}else if(choice.equals("3")) {
				pl("리스트로 돌아갑니다.");
				list();
			}
			
			rs.close();
			pstmt.close();
			
		}catch (SQLException se) {
			se.printStackTrace();
			exit();
		}catch (Exception e) {
			
		}
		list();
	}
	public void clear1() {
		BoardDTO board = new BoardDTO();
		pl("");
		pl("[게시물 전체 삭제]");
		pl("----------------------------------------------");
		pl("보조 메뉴: 1.OK | 2.Cancel");
		p("메뉴 선택: ");
		String choice = sc.nextLine();
		if(choice.equals("1")) {
			p("정말로 전부 삭제하시겠습니까? (y 또는 n): ");
			String yesOrNo = sc.nextLine();
			if(yesOrNo.equals("y") || yesOrNo.equals("Y")) {
				try {
					pl("");
					PreparedStatement pstmt = null;
					String dropSql = 	"""
										TRUNCATE TABLE boards;
										""";
					pstmt = conn.prepareStatement(dropSql);
					pstmt.executeUpdate();
					pl("### 전부 삭제 되었습니다. ###\n");
				}catch (SQLException se) {
					exit();
				}catch (Exception e) {
					
				}
			}else if(yesOrNo.equals("n") || yesOrNo.equals("N")) {
				pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
				list();
			}else {
				pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
				list();
			}
		}else if(choice.equals("2")) {
			pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}else {
			pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}
		list();
	}
	public void exit() {
		pl("** 게시판 종료 **");
		if(conn != null) {
			try {
				conn.close();
			}catch (SQLException se) {
				
			}
		}
	}
	
	
	
	
	public void select() {
		try {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String selectSql = 	"""
								select bno, bwriter, bcontent,
								bdate, btitle
								from boards;
								""";
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setBno(rs.getInt("bno"));
				board.setBcontetn(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						board.getBno(),
						board.getBcontetn(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		}catch (SQLException se) {
			se.printStackTrace();
			exit();
		}catch (Exception e) {
			
		}
	}
	public void insert(BoardDTO board) {
		try {
			PreparedStatement pstmt = null;
			String insertSql = 	"""
								insert into boards
								(btitle, bcontent,
								bwriter, bdate)
								values(?,?,?, now());
								""";
			
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontetn());
			pstmt.setString(3, board.getBwriter());
			int rows = pstmt.executeUpdate();
			pl("추가된 행 수 : " + rows);
			
			pstmt.close();
		}catch (SQLException se) {
			se.printStackTrace();
			exit();
		}catch (Exception e) {
			
		}
	}
	public void update(BoardDTO board) {
		pl("");
		pl("[수정 내용 입력]");
		p("제목: ");
		board.setBtitle(sc.nextLine());
		p("내용: ");
		board.setBcontetn(sc.nextLine());
		p("작성자: ");
		board.setBwriter(sc.nextLine());
		pl("----------------------------------------------");
		pl("보조 메뉴: 1.OK | 2.Cancel");
		p("메뉴 선택: ");
		String choice = sc.nextLine();
		if(choice.equals("1")) {
			p("정말로 수정하시겠습니까? (y 또는 n): ");
			String yesOrNo = sc.nextLine();
			if(yesOrNo.equals("y") || yesOrNo.equals("Y")) {
				try {
					PreparedStatement pstmt = null;
					String updateSql = 	"""
										update boards
										set btitle = ?,
										bcontent = ?,
										bwriter = ?
										where bno = ?;
										""";
					pstmt = conn.prepareStatement(updateSql);
					pstmt.setString(1, board.getBtitle());
					pstmt.setString(2, board.getBcontetn());
					pstmt.setString(3, board.getBwriter());
					pstmt.setInt(4, board.getBno());
					int rows = pstmt.executeUpdate();
					pl("수정된 행 수 : " + rows);
					
					pstmt.close();
				}catch (SQLException se) {
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}else if(yesOrNo.equals("n") || yesOrNo.equals("N")) {
				pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
				list();
			}else {
				pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
				list();
			}
		}else if(choice.equals("2")) {
			pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}else {
			pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}
		list();
	}
	public void delete(BoardDTO board) {
		p("정말로 삭제하시겠습니까? (y 또는 n): ");
		String choice = sc.nextLine();
		if(choice.equals("y") || choice.equals("Y")) {
			try {
				PreparedStatement pstmt = null;
				
				String deleteSql = 	"""
									delete from boards
									where bno = ?;
									""";
				pstmt = conn.prepareStatement(deleteSql);
				pstmt.setInt(1, board.getBno());
				int rows = pstmt.executeUpdate();
				pl("삭제된 행 수 : " + rows);
				
				pstmt.close();
			}catch (SQLException se) {
				exit();
			}catch (Exception e) {
				
			}
		}else if(choice.equals("n") || choice.equals("N")) {
			pl("취소를 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}else {
			pl("잘못 누르셨습니다. 목록으로 돌아갑니다.");
			list();
		}
		list();
	}
}
