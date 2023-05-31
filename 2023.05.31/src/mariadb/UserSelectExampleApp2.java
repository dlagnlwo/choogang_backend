package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExampleApp2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		
		try {
			Class.forName(MYSQL_DRIVER);
			
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 연결 성공....");
			
			String selectSql = 	"""
								select * from users
								where userid = ?;
								""";
			String deleteSql = 	"""
								delete from users
								where userid = ?;
								""";
			
//			delete(conn, deleteSql);
			System.out.printf("sql = %s\n", selectSql);
			select(conn, selectSql);
			
			
			pstmt.close();
			
		}catch (ClassNotFoundException ce) {
			
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
	public static ResultSet select(Connection conn, String selctSql) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(selctSql);
			pstmt.setString(1, "winter");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				
				System.out.println(user);
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void delete(Connection conn, String deleteSql) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(deleteSql);
			pstmt.setString(1, "summer");
			int rows = pstmt.executeUpdate();
			
			System.out.println("삭제한 행 수 : " + rows);
		}catch (Exception e) {
			
		}
	}
}
