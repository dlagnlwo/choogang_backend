package song.model;

import static song.util.MyIO.p;
import static song.util.MyIO.pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//Song테이블과 JDBC로 SQL실행 관리 클래스
public class SongDAO {
	//멤버변수(전역변수)
	Connection conn;
	Statement stmt;
	ResultSet rs;
	SongDTO songdto;
	
	//생성자
	public SongDAO(){
		this.conn = null;
		this.stmt = null;
		this.rs = null;
	}
	
	//메소드
	public Connection getConn() {
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
			
		}catch (SQLException se) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void close(ResultSet rs, Statement stmt, Connection conn) {
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
	public void close(Statement stmt, Connection conn) {
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
	public void close(Connection conn) {
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
	
	public ResultSet selectSong(Connection conn, String selectSql) {
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			//노래가 있는경우
			if(rs.next()) {
				do {
					int id = rs.getInt("id");
					String song_name = rs.getString("song_name");
					String song_contents = rs.getString("song_contents");
					String singer_name = rs.getString("singer_name");
					
					SongDTO songdto = new SongDTO(id, song_name, song_contents, singer_name);
					songdto.setId(id);
					songdto.setSong_name(song_name);
					songdto.setSong_contents(song_contents);					
					songdto.setSinger_name(singer_name);
					
					
					p("노래ID : " + songdto.getId() + " || " 
					+ "노래이름 : " + songdto.getSong_name()
					+ " || " + "곡 내용 : " + songdto.getSong_contents()
					+ " || " + "가수 이름 : " + songdto.getSinger_name() + "\n");
					
				}while(rs.next());
			}else {
				pl("등록된 노래가 없습니다.");
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	public void deleteSong(Connection conn, String deleteSql) {
		Statement stmt = null;
		
		try {	
			stmt = conn.createStatement();
			int deleteCount = stmt.executeUpdate(deleteSql);
			
			
			if(deleteCount > 0) {
				pl("");
				pl("" + deleteCount + "개의 자료를 삭제했습니다.");
				pl("");
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void insertSong(Connection conn, String insertSql) {
			Statement stmt = null;
		try {
			
			stmt = conn.createStatement();
			int insertCount = stmt.executeUpdate(insertSql);
			
			if (insertCount > 0) {
				pl("");
				pl("" + insertCount + "개의 자료를 추가했습니다.");
				pl("");
			}
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateSong(Connection conn,String updateSql) {
		Statement stmt = null;
		try {		
			stmt = conn.createStatement();
			int updateCount = stmt.executeUpdate(updateSql);
			
			if(updateCount > 0) {
				pl("");
				pl("" + updateCount + "개의 자료를 수정했습니다.");
				pl("");
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
