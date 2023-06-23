package org.zerock.jdbcex;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

class TodoDAOTestExApp {
	private TodoDAO todoDAO;
	
	@BeforeEach
	//TodoDAO객체를 초기화하는 작업
	public void ready() {
		todoDAO = new TodoDAO();
	}
//	@Test
//	public void testGetTime() {
//		System.out.println(todoDAO.getTime());
//	}
//	@Test
//	public void testGetTime2() throws Exception {
//		System.out.println(todoDAO.getTime2());
//	}
	
	@Test
	public void testInsert() throws Exception {
		//원래 사용했던 방식
		//TodoVO vo = new TodoVO();
		//vo.setTitle("Sample Title...");
		//vo.setDueDate(LocalDate.of(2023, 06, 20));
		//todoDAO.insert(vo);
		TodoVO vo = TodoVO.builder()
				.title("Sample Title...")
				.dueDate(LocalDate.of(2023, 06, 23))
				.build();
		todoDAO.insert(vo);
		System.out.println("추가되었습니다.");
	}
	//정보 수정 
//	@Test
//	public void testUpdate() throws Exception {
//		TodoVO vo = TodoVO.builder()
//				.tno(2L) //Long형 이기 때문에 숫자옆에L붙여준다.
//				.title("2번")
//				.dueDate(LocalDate.of(2023, 06, 22))
//				.finished(true)
//				.build();
//		todoDAO.update(vo);
//	}
	//정보 삭제
//	@Test
//	public void testDelete() throws Exception {
//		Long tno = 4l;
//		todoDAO.delete(tno);
//		System.out.println(tno + "번의 행을 삭제했습니다.");
//	}
	//전체 데이터 조회
	@Test
	public void testSelectAll() throws Exception {
		List<TodoVO> list = todoDAO.selectAll();
		//밑 vo는 변수
		list.forEach(vo -> System.out.println(vo));
	}
	//특정 데이터 조회
//	@Test
//	public void testSelectOne() throws Exception {
//		Long tno = 1L; //테이블에 있는 번호만 가능
//		TodoVO vo = todoDAO.selectOne(tno);
//		System.out.println(vo);
//	}
	
	
}
