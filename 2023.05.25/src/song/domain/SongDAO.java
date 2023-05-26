package song.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static song.util.MyIO.*;


//노래 데이터 관리
public class SongDAO implements Connectionable, Insertable, Updatable, Deletable, Selectable{
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public SongDAO(){
		//데이터베이스와 연결이 안된 상태로 시작.
		conn = null;
		stmt = null;
		rs = null;
		pstmt = null;
	}
	
	
	@Override
	public void seleceSong() {

	}

	@Override
	public void deleteSong() {		
		
	}

	@Override
	public void updateSong() {
		
	}

	@Override
	public void insertSong() {
				
	}
	@Override
	public void getConn() {
				
	}
	@Override
	public void close() {
				
	}
	
	
	
}
