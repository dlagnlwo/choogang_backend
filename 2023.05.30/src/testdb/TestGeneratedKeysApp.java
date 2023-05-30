package testdb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestGeneratedKeysApp {

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
			
			String sql = 	"""
							insert into boards
							values(?, ?, ?, now(), ?, ?);
							""";
			String filePath = "src/mariadb/images/snow.jpeg";
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpeg");
			pstmt.setBlob(5, new FileInputStream(filePath));
			
			
			int insertCount = pstmt.executeUpdate();
			System.out.println("추가된 행의 개수 : " + insertCount);
			
			if(insertCount == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("bno 의 개수 : " + bno);
					rs.close();
				}
			}
			
			pstmt.close();
		}catch (ClassNotFoundException ce) {
			
		}catch (SQLException se) {
			
		}catch (FileNotFoundException fe) {
			
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}

	}

}
