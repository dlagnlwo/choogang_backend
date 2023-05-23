package model.test;

import static model.util.MyIO.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
	private static final String MYSQL_DRIVER = "";
	private static final String JDBC_MYSQL_URL = "";
	private static final String USER = "root";
	private static final String PASS = "mariadb";
	
	private Connection connection;
	
	public DBTest(){
		try {
			
			Class.forName(MYSQL_DRIVER);
			pl("MYSQL 서버 접속 성공..");
			
			pl("MYSQL 데이터베이스 접속 연결중...");
			connection = DriverManager.getConnection(JDBC_MYSQL_URL, USER, PASS);
			pl("MYSQL 데이터베이스 접속 연결성공...");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConn() {
		return connection;
	}
	
	
	
}
