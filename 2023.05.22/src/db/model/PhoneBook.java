package db.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhoneBook {
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String JDBC_URL = "jdbc:h2:C:\\app\\database\\h2\\java;MODE=MariaDB;DATABASE_TO_UPPER=false";
	static final String USER_ID = "";
	static final String USER_PASS = "";
	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			pl("JDBC드라이버 연결 성공...");
			Thread.sleep(1000);
			
			pl("데이터베이스 연결중 ...");
			conn = DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);
			Thread.sleep(1000);
			pl("데이터베이스 연결 성공...");
			
			stmt = conn.createStatement();
			
			String createSql = 	"""
								CREATE TABLE phonebook (
								id INTEGER NOT NULL,
								name VARCHAR(20) NOT NULL,
								tel VARCHAR(20) NOT NULL,
								address VARCHAR(1000) NOT NULL,
								PRIMARY KEY(id));
								""";
			String selectSql = 	"""
								SELECT * FROM phonebook;
								""";
			
			String insertSql = 	"""
								INSERT INTO phonebook
								VALUES
								(1,'홍길동','010-1222-4655','경기도'),
								(2, '이순신', '010-4764-2225', '서울');
								""";
			String deleteSql = 	"""
								DELETE FROM phonebook
								WHERE name = '홍길동';
								""";
			String deleteSqlAll = 	"""
									DELETE FROM phonebook;
									""";
			
					
			
			
			
//			stmt.executeUpdate(createSql);
//			stmt.executeUpdate(insertSql);
//			stmt.executeUpdate(deleteSql);
//			stmt.executeUpdate(deleteSqlAll);
			rs = stmt.executeQuery(selectSql);
			
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String address = rs.getString("address");
				
				pl(	"id : " + id + "\t" +
				"name : " + name + "\t" +
				"tel : " + tel + "\t" +
				"address : " + address + "\t");
			}
//			rs.last();
//			if(rs.getRow() > 0) {
//				
//				while(rs.next());
//			}else {
//				pl("레코드가 없습니다.");
//			}
			
			
			
			stmt.close();
			conn.close();
			
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt == null) {
					stmt.close();
				}
			}catch (SQLException se) {
				
			}
			try {
				if(conn == null) {
					conn.close();
				}
			}catch (SQLException se) {
				
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
