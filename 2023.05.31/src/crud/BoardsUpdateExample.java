package crud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardsUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		try {
			
			Class.forName(MYSQL_DRIVER);
			
			System.out.println("데이터베이스 서버 연결중..");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 서버 연결성공....");
			
			String updateSql = new StringBuilder()
			.append("update boards set ")
			.append("btitle = ?, ")
			.append("bcontent = ?, ")
			.append("bfilename = ?, ")
			.append("bfiledate = ? ")
			.append("where bno = ?")
			.toString();
			
			String insertSql = 	"""
								insert into boards
								(btitle, bcontent, bwriter,
								bdate, bfilename, bfiledata)
								values (?,?,?,now(),?,?);
								""";
			String selectSql = 	"""
								select * from boards
								where btitle = ?;
								""";
			
			insert(conn, insertSql);
//			update(conn, updateSql);
			
			
		}catch (ClassNotFoundException ce) {
			
		}catch (SQLException se) {
			
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
	
	public static void update(Connection conn, String updateSql) {
		PreparedStatement pstmt = null;
		
		String filePath = "src/crud/images/snow.jpeg";
		
		try {
			
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snow");
			pstmt.setBlob(4, new FileInputStream(filePath));
			pstmt.setInt(5, 3);
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 개수 : " + rows);	
			
			pstmt.close();
			
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insert(Connection conn, String insertSql) {
		PreparedStatement pstmt = null;
		String filePath = "src/crud/images/snow.jpeg";
		
		try {
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow");
			pstmt.setBlob(5, new FileInputStream(filePath));
			
			int rows = pstmt.executeUpdate();
			System.out.println("추가된 행의 개수 : " + rows);
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
				}
				rs.close();
			}
			pstmt.close();
			
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch (Exception e) {
			
		}
	}
	
	public static ResultSet select(Connection conn,String selectSql) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setString(1, "winter");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String bwriter = rs.getString("bwriter");
				String bdate = rs.getString("bdate");
				String bfilename = rs.getString("bfilename");
				String bfiledate = rs.getString("bfiledate");
				
				System.out.println("title : " + btitle + "\t" +
				"content : " + bcontent + "\t" +
				"writer : " + bwriter + "\t" + 
				"date : " + bdate + "\t" + 
				"filename : " + bfilename + "\t" +
				"filedate : " + bfiledate);
				
				
				
			}
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
		return rs;
	}
}
