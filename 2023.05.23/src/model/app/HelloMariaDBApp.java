package model.app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import model.vo.*;

import static model.util.MyIO.*;
import model.connect.DBConnection;

public class HelloMariaDBApp {

	public static void main(String[] args) {
		
		DBConnection db = new DBConnection();
		Connection conn = db.getConn();
		//위와 밑은 같음.
		//Connection conn = new DBConnection().getConn();
		
		//1. DBConnection 객체를 이용해서 mariadb서버에 접속
		
		//2. MySQL 워크벤치로 테이블을 하나 만듭니다.
		//몇개의 레코드를 추가합니다.
		//3. JDBC기술을 이용하여 SELECT 쿼리를 만듭니다.
		//결과를 화면에 출력
		//4. 더이상 db와 연결이 필요하지 않으면 DB연결 종료
		
		String selectSql = 	"""
							SELECT * from register;
							""";
		
		String insertSql = 	"""
							insert into register
							values(104, 'smith', 'sam', 35); 
							""";
		
		
		
		
		try {
			Statement stmt = conn.createStatement();
			
			
//			stmt.executeUpdate(insertSql);
			ResultSet rs = stmt.executeQuery(selectSql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String first = rs.getString("first");
				String last = rs.getString("last");
				int age = rs.getInt("age");
				
				MemberVO membervo = new MemberVO(id, age, first, last);
				
				p("id : " + membervo.getId() + "\t");
				p("age : " + membervo.getAge() + "\t");
				p("first : " + membervo.getFirst() + "\t");
				pl("last : " + membervo.getLast());
			}
			
			
			
			
			stmt.close();
			conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn == null) {
					conn.close();
				}
			}catch (SQLException se) {
				
			}
		}
		
		
		

		

	}

}
