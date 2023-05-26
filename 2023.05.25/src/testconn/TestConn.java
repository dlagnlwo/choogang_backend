package testconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static test.util.TestUtil.*;

public class TestConn {
	
	
	
	public Connection getConn(Connection conn, String sql) {
		conn = null;
		
		try {
			final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String MYSQL_URL = "jdbc:mysql://localhost/muse";
			final String USER = "root";
			final String PASS = "mariadb";
			
			Class.forName(MYSQL_DRIVER);
			pl("MYSQL 서버 접속 성공...");
			
			pl("데이터베이스 접속 연결중..");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			pl("데이터베이스 접속 성공....");
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			
		}
		return conn;
	}
}
