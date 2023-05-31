package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExampleApp {
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
			System.out.println("데이터베이스 연결 성공");
			
			String selectSql = 	"""
								select * from users
								where userid = ?;
								""";
			select(conn, selectSql);
			
		}catch (ClassNotFoundException ce){
			ce.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			
		}finally {
			try {
				if(conn != null) {
					System.out.println("연결종료");
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
	public static ResultSet select(Connection conn, String selectSql) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(selectSql);
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
				System.out.println("사용자 아이디가 존재하지 않습니다.");
			}
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
		return rs;
	}
}
