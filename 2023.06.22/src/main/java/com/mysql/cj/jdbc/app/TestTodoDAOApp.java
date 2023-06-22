package com.mysql.cj.jdbc.app;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.dao.TestTodoDAO;
import com.mysql.cj.jdbc.domain.TestTodoVO;

class TestTodoDAOApp {
	TestTodoDAO dao;
	
	@BeforeEach
	public void ready() {
		dao = new TestTodoDAO();
	}
	@Test
	public void testInsert() {
		
	}
//	@Test
//	public void testUpdate() throws Exception {
//		TestTodoVO vo = TestTodoVO.builder()
//				.tno(2L)
//				.title("2번입니다")
//				.dueDate(LocalDate.of(2023, 6, 22))
//				.finished(true)
//				.build();
//		dao.update(vo);
//	}
//	@Test
//	public void delete() throws Exception {
//		Long tno = 2l;
//		dao.delete(tno);
//		System.out.println(tno + " 번이 삭제되었습니다.");
//	}
	
	@Test
	public void testSelectAll() throws Exception {
		List<TestTodoVO> list = dao.selectAll();
		list.forEach(vo -> System.out.println(vo));
	}
	
//	@Test
//	public void testSelectOne() throws Exception {
//		Long tno = 2L;
//		TestTodoVO vo = dao.selectOne(tno);
//		System.out.println("검색된 컬럼 : " + vo);
//	}
	

}
