package org.zerock.jdbcex.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.domain.TodoVO;

import lombok.Cleanup;

public class TodoDAO {
	public String getTime() {
		String now = null;
		
		try{
			Connection conn = ConnectionUtil.INSTANCE.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select now();");
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			now = rs.getString(1); //첫번째 컬럼을 가져와라
		}catch(Exception e) {
			
		}
		return now;
	}
	public ResultSet getTime2() throws Exception {
		String selectSql = 	"""
							select * from tbl_todo;
							""";
		// @Cleanup 이용
		// 예외발생 구간, 자원이 열려있는 경우
		// 열려진 자원 객체를 종료해준다.
		// lombok 라이브러리가 있을때만 사용할 수 있는 어노테이션
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(selectSql);
		@Cleanup ResultSet rs = pstmt.executeQuery();
		
		
		while(rs.next()) {
			TodoDTO dto = new TodoDTO();
			dto.setTno(rs.getLong("tno"));
			dto.setTitle(rs.getString("title"));
			dto.setDueDate(rs.getDate("dueDate").toLocalDate());
			dto.setFinished(rs.getBoolean("finished"));
			
			System.out.print("tno : " + dto.getTno() + " || ");
			System.out.print("title : " + dto.getTitle() + " || ");
			System.out.print("DueDate : " + dto.getDueDate() + " || ");
			System.out.print("DueDate : " + dto.isFinished() + " || \n");
		}
		return rs;
	}
	//리턴값이 없기때문에 void로 작성
	public void insert(TodoVO vo) throws Exception {
		String insetSql = 	"""
							insert into tbl_todo(title, dueDate, finished)
							values(?,?,?);
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(insetSql);
		pstmt.setString(1, vo.getTitle());
		//Date는 Date.valueOf(~)
		pstmt.setDate(2, Date.valueOf(vo.getDueDate()));
		//boolean은 is~
		pstmt.setBoolean(3, vo.isFinished());
		
		pstmt.executeUpdate();
	}
	//전체 목록 가져오기
	//select문 전체 조회 List활용
	//제네릭 프로그래밍
	public List<TodoVO> selectAll() throws Exception {
		String selectSql = 	"""
							select * from tbl_todo;
							""";
		List<TodoVO> list = new ArrayList<>();
		
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
	//특정 컬럼만 조회
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
	//삭제기능은 리턴값이 없기때문에 void로 작성
	//특정값을 삭제해야 되기때문에 매개변수 (Long tno)
	public void delete(Long tno) throws Exception {
		String deleteSql = 	"""
							delete from tbl_todo
							where tno = ?
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(deleteSql);
		pstmt.setLong(1, tno);
		pstmt.executeUpdate();
	}
	
	//수정기능은 리턴값이 없기때문에 void로 작성
	//전체 레코드를 수정해야하기때문에 매개변수 (TodoVO todoVO)
	public void update(TodoVO todoVO) throws Exception {
		String updateSql = 	"""
							update tbl_todo
							set title = ?, dueDate = ?,
							finished = ?
							where tno = ?;
							""";
		@Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
		@Cleanup PreparedStatement pstmt = conn.prepareStatement(updateSql);
		pstmt.setString(1, todoVO.getTitle());
		pstmt.setDate(2, Date.valueOf(todoVO.getDueDate()));
		pstmt.setBoolean(3, todoVO.isFinished());
		pstmt.setLong(4, todoVO.getTno());
		
		pstmt.executeUpdate();
		
	}
}
