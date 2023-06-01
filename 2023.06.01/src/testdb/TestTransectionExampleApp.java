package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransectionExampleApp {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
			//자동커밋끄기
			conn.setAutoCommit(false);
			
			String updateSql1 = """
								update acounts
								set balance = balance - ?
								where ano = ?;
								""";
			pstmt = conn.prepareStatement(updateSql1);
			pstmt.setInt(1, 20000);
			pstmt.setString(2, "111-1111-1111");
			int rows1 = pstmt.executeUpdate();
			if(rows1 == 0) throw new Exception("출금되지않았음.");
			pstmt.close();
			
			String updateSql2 = """
								update acounts
								set balance = balance + ?
								where ano = ?;
								""";
			
			pstmt = conn.prepareStatement(updateSql2);
			pstmt.setInt(1, 20000);
			pstmt.setString(2, "222-2222-2222");
			int rows2 = pstmt.executeUpdate();
			
			if(rows2 == 0) throw new Exception("입금되지않았음.");
			pstmt.close();
			
			//작업 끝나면 커밋
			conn.commit();
			System.out.println("계좌이체 성공!");
			conn.close();
		}catch (Exception e) {
			try {
				//실패하면 롤백
				conn.rollback();
				System.out.println("롤백했습니다.");
			}catch (SQLException se) {
				e.printStackTrace();
			}
		}finally {
			try {
				conn.setAutoCommit(true);
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				
			}
		}
	}
}
