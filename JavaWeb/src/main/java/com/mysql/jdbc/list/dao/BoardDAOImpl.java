package com.mysql.jdbc.list.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.list.dto.Board;

public class BoardDAOImpl implements BoardDAO{
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	

	private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String MYSQL_URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String USER = "root";
	private static final String PASS = "mariadb";
	
	
	
	@Override
	public List<Board> selectList() {
		List<Board> boardList = new ArrayList<>();
		try {
			
			Class.forName(MYSQL_DRIVER);
			Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASS);
			String selectSql = 	"""
								select bno, btitle, bcontent,
								bwriter, bdate
								from boards;
								""";
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				boardList.add(board);
			}
			
			rs.close();
			pstmt.close();
				
		}catch (SQLException se) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
	}
	
}
