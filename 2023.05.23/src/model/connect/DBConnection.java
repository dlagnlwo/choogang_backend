package model.connect;

import static model.util.MyIO.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	//MySQL 설정 상수
	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String MARIADB_DRIVER = "org.mariadb.jdbc.Driver";
	private static final String JDBC_MARIADB_URL = "jdbc:mariadb://127.0.0.1:3306/java";
	private static final String USER = "root";
	private static final String PASS = "mariadb";
	
	private Connection connection;
	
	public DBConnection(){
		try {
			Class.forName(MYSQL_DRIVER);
			pl("MySQL 드라이버 연결 성공..");
			
			pl("MySQL 데이터베이스 접속중...");
//			Thread.sleep(1000);
			connection = DriverManager.getConnection(JDBC_MYSQL_URL, USER, PASS);
			pl("MySQL 데이터베이스 접속성공...");	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {	
		return connection;
	}
	
	
}
