package song.app;

import static song.util.MyIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SongDAODemoApp {
	
	public static void main(String[] args) {
			Connection con = getConn();
			close(con);
	}
	
	public static Connection getConn() {
		//conn은 실행되기 전에 반드시 초기화해야함.
		//초기화 = 0에 가장 가까운 값으로 초기화
		Connection conn = null;
		
		//localhost == 127.0.0.1
		try {
			final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String MYSQL_URL = "jdbc:mysql://localhost/muse";
			final String USER = "root";
			final String PASS = "mariadb";
			
			Class.forName(MYSQL_DRIVER);
			pl("MYSQL 서버 연결 성공");
			
			pl("MYSQL 데이터베이스 연결중...");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			pl("MYSQL 데이터베이스 연결성공...");
			
			close(conn);
			
		}catch (SQLException se) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
		return conn;
	}
	
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		//ResultSet 닫기
		try {
			if(rs != null) {
				rs.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
		//stmt닫기
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
		//conn닫기
		try {
			if(conn != null) {
				conn.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
	}
	public static void close(Statement stmt, Connection conn) {
		//stmt닫기
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
		//conn닫기
		try {
			if(conn != null) {
				conn.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
	}
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				
			}
		}
	}
	public static ResultSet selectSong(Connection conn, String selectSql) {
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			//노래가 있는경우
			if(rs.next()) {
				do {
					
				}while(rs.next());
			}else {
				pl("등록된 노래가 없습니다.");
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 
	}
}
