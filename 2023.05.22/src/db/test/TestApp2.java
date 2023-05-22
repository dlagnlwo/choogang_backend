package db.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApp2 {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String JDBC_URL = "jdbc:h2:C:\\app\\database\\h2\\java;MODE=MariaDB;DATABASE_TO_UPPER=false";
	static final String USER_ID = "";
	static final String USER_PASS = "";
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			pl("JDBC드라이버 연결 성공...");
			
			pl("데이터베이스 연결중...");
			Thread.sleep(1000);
			conn = DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);
			Thread.sleep(1000);
			pl("데이터베이스 연결 성공...");
			
			stmt = conn.createStatement();
			
			String createSql = 	"""
								CREATE TABLE test2 (
								id INTEGER NOT NULL,
								name VARCHAR(20) NOT NULL,
								addr VARCHAR(50) NOT NULL,
								pass VARCHAR(50) NOT NULL);
								""";
			String selectSql = 	"""
								SELECT * FROM test2
								""";
			String insertSql = 	"""
								INSERT INTO test2
								VALUES(1, 'smith', 'aaa', 								'123'),
								(2, 'holand', 'bbb', 								'11122');
								""";
			
			ResultSet rs = stmt.executeQuery(selectSql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String pass = rs.getString("pass");
				
				pl("id : " + id + " || " + "name : " + name   				+ " || " + "addr : " + addr + " || " + 				"pass : " + pass);
				pl("---------------------------------------------------");
			}
//			stmt.executeUpdate(createSql);
//			stmt.executeUpdate(insertSql);
			
			
			
			
			stmt.close();
			conn.close();
			
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt == null) {
					stmt.close();
				}
			}catch (SQLException se) {
				
			}
			try {
				if(conn == null) {
					conn.close();
				}
			}catch(SQLException se) {
				
			}
		}

	}
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}

}
