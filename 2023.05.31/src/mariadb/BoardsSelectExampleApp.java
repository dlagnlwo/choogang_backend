package mariadb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardsSelectExampleApp {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
		final String USER = "root";
		final String PASS = "mariadb";
		
		try {
			Class.forName(MYSQL_DRIVER);
			
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			
			String sql = 	"""
							select * from boards
							where bwriter = ?
							""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
//			pstmt.setInt(2, 3);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Boards board = new Boards();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledate(rs.getBlob("bfiledate")); //2진데이터
				System.out.println(board);
				System.out.println("#########################################");
				
				// board객체의 bfiledata를 파일로 저장
				// board DTO객체의 Blob형식 bfiledata의 참조주소를
				// blob변수에 저장
				// 참조는 원본 데이터를 직접 접근할 수 있다.
				// 참조변수가 원본을 바꾸면 원본이 변한다.
				// 새로운 변수를 만들면 접근경로가 짧아진다. 따라서, 접근하기 쉽다.
				Blob blob = board.getBfiledate();
				
				if(blob != null) {
					//getBibaryStream()은 blob 객체로부터 읽어온다
					InputStream is = blob.getBinaryStream();
					OutputStream os;
					String folderpath = "c:/Temp/";
					String filepath = folderpath + board.getBfilename();
					File folder = new File(filepath);
					
					if (!folder.exists()) {
						try {
							folder.mkdir();
							System.out.println("폴더를 생성했습니다");
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
					os = new FileOutputStream(filepath);
					is.transferTo(os); //파일을 저장해서 전송
					
					
					os.flush(); //남은 바이트쓰지않고 닫는다는 뜻
					os.close();
					is.close();
				}
				rs.close();
				pstmt.close();
			}

		}catch (Exception e) {
			
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
}	
