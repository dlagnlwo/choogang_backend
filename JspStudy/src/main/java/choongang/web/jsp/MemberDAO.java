package choongang.web.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDAO {
	//멤버변수
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//멤버상수
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
	private final String USER = "root";
	private final String PASS = "mariadb";
	
	
	private void getConn() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("데이터베이스 연결중...");
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			System.out.println("데이터베이스 연결성공..");
		}catch (Exception e) {
			
		}
	}
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			getConn();
			String selectSql = 	"""
								select bno, btitle, bwriter,
								bdate
								from boards;
								""";
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO board = new MemberVO();
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bwriter = rs.getString("bwriter");
				Date bdate = rs.getDate("bdate");
				
				board.setBno(bno);
				board.setBtitle(btitle);
				board.setBwriter(bwriter);
				board.setBdate(bdate);
				list.add(board);
			}
			rs.close();
			pstmt.close();
			conn.close();
			close();
		}catch (Exception e) {
			
		}
		return list;
	}
	private void close() {
		if(rs != null) {
			try {
				rs.close();
			}catch (SQLException se) {
				
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch (SQLException se) {
				
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch (SQLException se) {
				
			}
		}
	}
}
