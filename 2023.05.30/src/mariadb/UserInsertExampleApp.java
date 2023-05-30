package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInsertExampleApp {
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
			
			System.out.println("데이터베이스 접속중...");			
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 접속 성공..");
			
			String insertSql = 	"""
								insert into users
								values(?,?,?,?,?);
								""";
			//Statement는
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "winter@mycompony.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			String selectSql = 	"""
					select * from users
					where id = ?;
					""";
//			pstmt = conn.prepareStatement(selectSql);
//			pstmt.setString(1, "1");
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				String id = rs.getString("id");
//				String username = rs.getString("username");
//				String userpassword = rs.getString("userpassword");
//				int userage = rs.getInt("userage");
//				String useremail = rs.getString("useremail");
//				
//				System.out.println(id + "\t" + username +
//						"\t" + userpassword +
//						"\t" + userage +
//						"\t" + useremail);
//			}
				
//			rs.close();
			pstmt.close();
			
			
		}catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (SQLException se) {
				
			}catch (Exception e) {
				
			}
		}
		
		
	}
}
