package test.connection;

import static test.util.testUtil.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String USER = "root";
	private static final String PASS = "mariadb";
	
	Connection conn;
	
	public TestConnection() {
		try {
			pl("MYSQL 서버 접속 성공...");
			Class.forName(MYSQL_DRIVER);
			
			pl("데이터베이스 연결중...");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			pl("데이터베이스 연결 성공....");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	
	//닫기
	public void close(Connection conn, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			
		}
	}
	
}
