package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInsertExampleApp2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String MYSQL_URL = "jdbc:mysql://localhost/thisisjava";
			final String USER = "root";
			final String PASS = "mariadb";
			
			Class.forName(MYSQL_DRIVER);
			
			System.out.println("데이터베이스 연결중..");
			conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			System.out.println("데이터베이스 연결 성공....");
	
			String insertSql = 	"""
					insert into users
					values(?,?,?,?,?);
					""";
//			insert(conn, insertSql);
				
//			delete(conn);
			
//			update(conn);
			select(conn);
			
			pstmt.close();
			
		}catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			
		}finally {
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
	public static void insert(Connection conn, String insertSql) {
		PreparedStatement pstmt = null;
		
		
		try {
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, "3");
			pstmt.setString(2, "한가을");
			pstmt.setString(3, "7897");
			pstmt.setInt(4, 22);
			pstmt.setString(5, "qqq@naver.com");
			
			int rows = pstmt.executeUpdate();
			
			System.out.println("추가된 행 수 : " + rows);
			

		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
	}
	public static ResultSet select(Connection conn) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			String selectSql = 	"""
					select * from users
					where userage > ?;
					""";
			pstmt = conn.prepareStatement(selectSql);
			
			pstmt.setInt(1, 20);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String userid = rs.getString("userid");
				String username = rs.getString("username");
				String userpassword = rs.getString("userpassword");
				String userage = rs.getString("userage");
				String useremail = rs.getString("useremail");
				
				System.out.println("id : " + userid + "\t" + 
						"username : " + username + "\t" + 
						"userpassword : " + userpassword + "\t" + 
						"userage : " + userage + "\t" + 
						"useremail : " + useremail);
			}
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
		return rs;
	}
	public static void delete(Connection conn) {
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		String choice = "";
		try {
			String deleteSql = 	"""
								delete from users
								where userid = ?
								""";
			pstmt = conn.prepareStatement(deleteSql);
			pstmt.setString(1, "3");
			
			
			System.out.print("정말로 삭제하시겠습니까? (y / n) : ");
			choice = sc.next();
			if(choice.equals("y") || choice.equals("Y")) {
				pstmt.executeUpdate();
				System.out.println("\n삭제했습니다\n");
			}else if(choice.equals("n") || choice.equals("N")) {
				System.out.println("\n삭제취소했습니다.\n");
			}
							
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
	}
	public static void update(Connection conn) {
		PreparedStatement pstmt = null;
		try {
			String updateSql = 	"""
								update users
								set userid = ?
								where userid = ?;
								""";
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setString(1, "summer");
			pstmt.setString(2, "2");
			int updateCount = pstmt.executeUpdate();
			
			
			System.out.println("\n수정되었습니다.\n");
		}catch (SQLException se) {
			
		}catch (Exception e) {
			
		}
	}
}
