package member.app;

import static member.util.MemberUtil.p;
import static member.util.MemberUtil.pl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import member.connection.MemberConn;
import member.vo.MemberVO;

public class MemberApp {

	public static void main(String[] args) {
		try {
			Connection conn = new MemberConn().getConn();
						
			Statement stmt = conn.createStatement();
			
			
			String insertSql = 	"""
								insert into member
								values(107, '파이썬7', 'python7', 'python1237');
								""";
			String deleteSql = 	"""
								delete from member
								where id = 106;
								""";
			String selectSql =	"""
								select * from member;
								""";
	
			printMemberList(stmt, selectSql); //select
//			int updateCount = insertMember(stmt, insertSql);	
//			stmt.executeUpdate(deleteSql);
					
			conn.close();			

		}catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	private static int insertMember(Statement stmt, String sql) {
		
		//0으로하면 양수의 값만 나오기 때문에 만일에 대비 -1을 초기값으로 해야함.
		int updateCount = -1;
		try {
			updateCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCount;
	}
	private static void printMemberList(Statement stmt, String sql) {
		ResultSet rs = null;
		try {	
			rs = stmt.executeQuery(sql);
			while(rs.next()) {		
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				String nick = rs.getString("nick");
				
				
				MemberVO membervo = new MemberVO(id, name, passwd, nick);
				
				membervo.setId(id);
				membervo.setName(name);
				membervo.setPasswd(passwd);
				membervo.setNick(nick);
				
				
				p("id = " + membervo.getId() + " ||| ");
				p("name = " + membervo.getName() + " ||| ");
				p("passwd = " + membervo.getPasswd() + " ||| ");
				pl("nick = " + membervo.getNick());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			}catch (Exception e) {
				
			}
		}
	}
}
