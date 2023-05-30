package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionExampleApp2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
			final String USER = "root";
			final String PASS = "mariadb";
			
			Class.forName(MYSQL_DRIVER);
			System.out.println("서버 접속 성공");
			
			System.out.println("데이터베이스 연결중..");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 접속 성공...");
			
			
//			String insertSql = 	"""
//					insert into users
//					values (?, ?, ?, ?, ?);
//					""";
			
			String insertSql = new StringBuilder()
								.append("insert into users")
								.append("values(?,?,?,?,?)")
								.toString();
			
//			pstmt = conn.prepareStatement(insertSql);
//			pstmt.setString(1, "1");
//			pstmt.setString(2, "홍길동");
//			pstmt.setString(3, "1234");
//			pstmt.setString(4, "25");
//			pstmt.setString(5, "asd@naver.com");
//			System.out.println("데이터가 추가되었습니다.");
			
			
			
			rs = pstmt.executeQuery();
			
			
			
			
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
					System.out.println("pstmt연결을 끊었습니다.");
				}
				if(conn != null) {
					conn.close();
					System.out.println("연결을 끊었습니다.");
				}
			}catch (Exception e) {
				
			}
		}
	}
	
	public static void insert(Connection conn) {
		

			
	}
}
