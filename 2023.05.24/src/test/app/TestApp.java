package test.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static test.util.testUtil.*;

import test.connection.TestConnection;
import test.vo.TestVO;

public class TestApp {

	public static void main(String[] args) {
		
		try {
			Connection conn = new TestConnection().getConn();
			Statement stmt = conn.createStatement();
			
			String select = """
							select * from goods;
							""";
			String insert = """
							insert into goods
							values(2, 'sam', 102, 25000);
							""";
			String delete = """
							delete from goods
							where id = 2;
							""";
			String update = """
							update goods set name = 'holand'
							where name = 'sam';
							""";
			
//			insertSql(stmt, insert);
//			deleteSql(stmt, delete);
//			updateSql(stmt, update);
			selectSql(stmt, select);
			
			conn.close();
		}catch (SQLException se) {
			se.printStackTrace();
		}

	}
	
	//insert
	public static int insertSql(Statement stmt, String sql) {
		int insertCount = -1;
		
		try {
			insertCount = stmt.executeUpdate(sql);
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return insertCount;
	}
	//delete
	public static int deleteSql(Statement stmt, String sql) {
		int deleteCount = -1;
		try {
			deleteCount = stmt.executeUpdate(sql);
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return deleteCount;
	}
	//update
	public static int updateSql(Statement stmt, String sql) {
		int updateCount = -1;
		try {
			updateCount = stmt.executeUpdate(sql);
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return updateCount;
	}
	
	//select
	//select는 ResultSet에 담아야 함.
	public static void selectSql(Statement stmt, String sql) {
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int goodscode = rs.getInt("goodscode");
				int price = rs.getInt("price");
				
				TestVO vo = new TestVO(id, name, goodscode, price);
				
				vo.setId(id);
				vo.setName(name);
				vo.setGoodscode(goodscode);
				vo.setPrice(price);
				
				p("id = " + vo.getId() + " ||| ");
				p("name = " + vo.getName() + " ||| ");
				p("goodscode = " + vo.getGoodscode() + " ||| ");
				pl("price = " + vo.getPrice() + " ||| ");
			}
			
		}catch (SQLException se) {
			se.printStackTrace();
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
