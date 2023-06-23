package org.zerock.jdbcex.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.zerock.jdbcex.domain.TodoVO;

import lombok.Cleanup;

public class TodoDAO {
	public List<TodoVO> selectAll() throws Exception {
		List<TodoVO> list = new ArrayList<>();
		String selectSql = 	"""
							select * from tbl_todo;
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(selectSql);
		@Cleanup ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			TodoVO vo = TodoVO.builder()
					.tno(rs.getLong("tno"))
					.title(rs.getString("title"))
					.dueDate(rs.getDate("dueDate").toLocalDate())
					.finished(rs.getBoolean("finished"))
					.build();
			list.add(vo);
		}
		return list;
	}
	public TodoVO selectOne(Long tno) throws Exception {
		String selectSql = 	"""
							select * from tbl_todo
							where tno = ?;
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(selectSql);
		pstmt.setLong(1, tno);
		@Cleanup ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		TodoVO vo = TodoVO.builder()
				.tno(rs.getLong("tno"))
				.title(rs.getString("title"))
				.dueDate(rs.getDate("dueDate").toLocalDate())
				.finished(rs.getBoolean("finished"))
				.build();
		return vo;
	}
	public void insert(TodoVO vo) throws Exception {
		String insertSql = 	"""
							insert into tbl_todo(tno, title, dueDate, finished)
							values(?,?,?,?);
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(insertSql);
		pstmt.setLong(1, vo.getTno());
		pstmt.setString(2, vo.getTitle());
		pstmt.setDate(3, Date.valueOf(vo.getDueDate()));
		pstmt.setBoolean(4, vo.isFinished());
		
		pstmt.executeUpdate();
	}
	public void update(TodoVO vo) throws Exception {
		String updateSql = 	"""
							update tbl_todo 
							set title=?, dueDate=?, finished=?
							where tno = ?;
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(updateSql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setDate(2, Date.valueOf(vo.getDueDate()));
		pstmt.setBoolean(3, vo.isFinished());
		pstmt.setLong(4, vo.getTno());
		pstmt.executeUpdate();
	}
	public void delete(Long tno) throws Exception {
		String deleteSql = 	"""
							delete from tbl_todo
							where tno = ?;
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(deleteSql);
		pstmt.setLong(1, tno);
		pstmt.executeUpdate();
	}
}
