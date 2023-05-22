package db.model;

import java.sql.*;
import java.util.*;

public class H2ConnectionDemoApp {
	//JDBC Driver이름은 최상위도메인.데이터베이스명.Driver
	//JDBC 프로토콜 이름은 JDBC:서버주소:포트명:데이터베이스의 이름을 사용
	//1. 디비 연결
	//2. PreparedStatement 생성
	//3. sql문
	//4. db 닫기
	
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String JDBC_URL = "jdbc:h2:C:\\app\\database\\h2\\java;MODE=MariaDB;DATABASE_TO_UPPER=false";
	static final String USER_ID = "";
	static final String USER_PASS = "";
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs = null;
		
		try {
			
			Class.forName(JDBC_DRIVER);
			pl("jdbc 드라이브 연결성공...");
			Thread.sleep(1000);
			pl("데이터베이스 서버 연결중...");
			
			conn = DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);
			Thread.sleep(1000);
			pl("데이터베이스 연결성공...");
			
			stmt = conn.createStatement();
			
			String dropSql = "DROP TABLE IF EXISTS member2";
			
			
			String createSql = 	"DROP TABLE IF EXISTS 								member2;" +
								"CREATE TABLE member2 (" +
								"   id INTEGER NOT NULL, " +
								"   first VARCHAR(100), " +
								"   last VARCHAR(100)," +
								"   age INTEGER, " +
								"   PRIMARY KEY(id) " +
								");";
			
			String insertSql = 	"INSERT INTO member2" +
								"(id, first, last, age) " +
								"VALUES (101, 'Zara', 								'Ali',18)," + 
								"(102, 'Mahnaxz', 								'fatma', 25)," +
								"(103, 'Sumit', 'Mittal', 								28);";
			
			String selectSql = 	"""
									SELECT count(*) rows 									FROM member2
									WHERE id != 101;
																
								""";
			
			String deleteSql = 	"""
								DELETE FROM member2
								WHERE id = 101;
								""";
			String deleteSqlAll = 	"""
									DELETE FROM member2;
									""";
			
			String updateSql = 	"""
								UPDATE member2 SET
								age = 20,
								first = 'Sara',
								last = 'Bli'
								WHERE id = 101;
								""";
			
			
			ArrayList<H2ConnectionDemo> list = new ArrayList<>();
			
			//ResultSet : SELECT의 결과를 저장하는 객체.
			
			//sql문을 저장하는 ResultSet을 쓰면 executeQuery를 쓰면됨.
			//결과값을 리턴해주는 executeQuery
			ResultSet rs = stmt.executeQuery(selectSql);

			
			
//			while(rs.next()) {
//				H2ConnectionDemo h2 = new H2ConnectionDemo();
//				h2.setId(rs.getInt("id"));
//				h2.setFirst(rs.getString("first"));
//				h2.setLast(rs.getString("last"));
//				h2.setAge(rs.getInt("age"));
//				list.add(h2);
//			}
//		
//			for(int i = 0; i < list.size(); i++) {
//				p("id : " + list.get(i).getId() + "\t");
//				p("first : " + list.get(i).getFirst() + "\t");
//				p("last : " + list.get(i).getLast() + "\t");
//				pl("age : " + list.get(i).getAge());
//			}
			
			//레코드 커서를 가장 마지막으로 이동시킨다.
			rs.last();
			//rs에 레코드(데이터)가 있다는 의미
			
			if(rs.getRow() > 0) {
				while(rs.next()) {
					
				}
			} else {
				pl("레코드가 없습니다.");
				
			}
			while(rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first");
				String last = rs.getString("last");
				int age = rs.getInt("age");
				
				pl("   "+ id + "\t" + first + "\t" + last + "\t" + age);
				pl("-------------------------------- ");
			}
			rs.close();
			

			//executeUpdate는 ResultSet 안쓸때만 하면됨.
//			stmt.executeUpdate(createSql);
//			stmt.executeUpdate(insertSql);
//			stmt.executeUpdate(updateSql);
	
//			pl("삭제 성공...");
//			stmt.executeUpdate(dropSql);
			
			stmt.close();
			conn.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt == null) {
					stmt.close();
				}
			}catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if(conn == null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
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
