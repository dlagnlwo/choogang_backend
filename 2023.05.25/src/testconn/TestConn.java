package testconn;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConn {
	
	
	
	public Connection getConn(Connection conn, String sql) {
		conn = null;
		
		try {
			final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String MYSQL_URL = "jdbc:mysql://localhost/muse";
			final String USER = "root";
			final String PASS = "mariadb";
			
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			
		}
		return conn;
	}
}
