package db.test;

import java.sql.*;import org.h2.command.query.Select;

public class TestApp {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String JDBC_URL = "jdbc:h2:C:\\app\\database\\h2\\java;MODE=MariaDB;DATABASE_TO_UPPER=false";
	static final String JDBC_USERID = "";
	static final String JDBC_USERPASS = "";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			pl("JDBC드라이버 연결 성공...");
			
			pl("데이터베이스 연결중...");
			Thread.sleep(1000);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERID, JDBC_USERPASS);
			pl("데이터베이스 연결성공...");
			Thread.sleep(1000);
			
			stmt = conn.createStatement();
			
			
			String createSql = 	"CREATE TABLE test1 (" +
								"    id INTEGER NOT NULL," +
								"    pass VARCHAR(20) NOT 								NULL," +
								"    name VARCHAR(10) NOT 								NULL," +
								"    addr VARCHAR(50) NOT 								NULL," +
								"    PRIMARY KEY(id)" +
								");";
			String selectSql = 	"""
					
								SELECT * FROM test1;
								""";
			String insertSql = 	"""
								INSERT INTO test1(id, pass, 								name, addr)
								VALUES(1, 'asdqwe123', 								'홍길동','경기도'),
								(2, 'qq11', '홍길순', '서울');
								""";
			String deleteSql = 	"""
								DELETE FROM test1;
								""";
			ResultSet rs = stmt.executeQuery(selectSql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String pass = rs.getString("pass");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				
				
				
//				pl("id : " + id + "\t" + "pass : " + pass + 				"\t" + "name : " + name + "\t" + "addr : 				" + addr + "");
				p("id : " + id + "   ");
				p("pass : " + pass + "   ");
				p("name : " + name + "   ");
				p("addr : " + addr + "   " + "\n");
				pl("====================================");
			}
			rs.close();
			
//			stmt.executeUpdate(createSql);
//			stmt.executeUpdate(insertSql);
//			stmt.executeUpdate(deleteSql);
//			pl("데이터 추가 성공...");
//			pl("테이블 만들기 성공...");
			
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
			}catch(SQLException se) {
				
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
