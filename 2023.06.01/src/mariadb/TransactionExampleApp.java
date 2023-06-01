package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExampleApp {
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
					
			//사용자 정의 트랜잭션 시작
			//1. 자동커밋끄기
			conn.setAutoCommit(false);
			
			//2. 트랜잭션 성공이면 conn.commit()
			//시나리오
			//1. 내계정에서 출금을 합니다.
			//2. 상대편에게 송금을 합니다.
			//3. 출금작업과 송금작업이 끝나면 트랜잭션 성공
			//4. 만일 하나라도 실패하면 트랜잭션 실패
			
			//출금작업
			String updateSql = 	"""
								update acounts
								set balance = balance - ?
								where ano = ?;
								""";
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "111-1111-1111");
			int rows = pstmt.executeUpdate();
			
			if(rows == 0) throw new Exception("출금되지않았음.");
			pstmt.close();
			
			//입금작업
			String updateSql2 = """
								update acounts
								set balance = balance + ?
								where ano = ?
								""";
			pstmt = conn.prepareStatement(updateSql2);
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "222-2222-2222");
			int rows2 = pstmt.executeUpdate();
			
			//Exception 을 썼기 때문에 catch에 Exception 예외를 해줘야함
			if(rows2 == 0) throw new Exception("입금되지않았음.");
			pstmt.close();
			
			//트랜잭션이 성공했으면 성공처리
			conn.commit();
			System.out.println("계좌이체 성공!");
					
		}catch (SQLException se) {
			
		}catch (Exception e) { //실패했을때
			try {
				//성공하지 못하면 롤백
				conn.rollback();
				
			}catch (SQLException se) {
				System.out.println("계좌이체 실패");
				se.printStackTrace();
			}
		}finally {
			try {
				//원래대로 자동커밋켜기
				conn.setAutoCommit(true);
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
}
