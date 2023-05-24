package member.connection;

import static member.util.MemberUtil.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberConn {
	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String USER = "root";
	private static final String PASS = "mariadb";
	
	private Connection conn;
	
	public MemberConn() {
		try {
			Class.forName(MYSQL_DRIVER);
			pl("MYSQL 서버 접속 성공...");
			
			pl("데이터베이스 접속중...");
			
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			pl("데이터베이스 접속성공....");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	
	public void close(Connection conn, Statement stmt, ResultSet rs ) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException se) {
			
		}
		
	}
	
	
	
	
	
	
}
