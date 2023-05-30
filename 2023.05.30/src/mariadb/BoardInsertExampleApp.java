package mariadb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExampleApp {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
	
		final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		
		try {
			Class.forName(MYSQL_DRIVER);
			
			System.out.println("데이터베이스 연결중..");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 연결 성공...");
			
			String sql = 	"""
							insert into boards(btitle,
							bcontent, bwriter, bdate, 
							bfilename, bfiledate) 
							values(?, ?, ?, now(), ?, ?);
							""";
			
			//자동증가
			//sql문으로 비교하면 auto_increament 와 같음
			pstmt = conn.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpeg");
			pstmt.setBlob(5, new FileInputStream
					("src/mariadb/images/snow.jpeg")); //현재 파일경로
						
			int rows = pstmt.executeUpdate();
			System.out.println("현재 디비에 저장한 행 수 : " + rows);
			
			//마지막 추가된 레코드의 마지막 primary key 일련번호 값 가져오기
			if(rows == 1) {
				//.getGeneratedKeys()는 primary key값을 반환함.
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("bno의 값 : " + bno);
					rs.close();
				}
			}
			
			pstmt.close();
		}catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (SQLException se) {
			
		}catch (FileNotFoundException fe) { //FileInputStream
			fe.printStackTrace();           //이 있기때문에 써야함
		}
		finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
}
