package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExampleApp {
	

	public static void main(String[] args) {
		Connection conn = null;
		
		Statement stmt = null;
		try {
			final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
			final String USER = "root";
			final String PASS = "mariadb";
			System.out.println("서버 접속 성공");
			Class.forName(JDBC_DRIVER);
			
			System.out.println("데이터베이스 연결중...");
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
			System.out.println("데이터베이스 연결 성공..");
			
//			#################################################
			long beforeTime = System.currentTimeMillis();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < 100_000; i++) {
				sb = sb.append("안녕하세요\n");
			}
			
			long afterTime = System.currentTimeMillis();
			long secDiffTime = (afterTime - beforeTime);
			System.out.println("StringBuilder 시간차이(ms) : " + secDiffTime);;
			
//			#######################################################
			
			beforeTime = System.currentTimeMillis();
			
			String st = new String();
			
			for(int i = 0; i < 100_000; i++) {
				st = st + new String("안녕하세여\n");
			}
			
			afterTime = System.currentTimeMillis();
			secDiffTime = (afterTime - beforeTime);
			System.out.println("String 시간차이(ms) : " + secDiffTime);;

//			########################################################
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
					System.out.println("연결끊음");
				}
			}catch (Exception e) {
				
			}
		}

	}

}
