package org.zerock.jdbcex.App;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

class TodoDAOTest {

	private TodoDAO todoDAO;
	@BeforeEach
	public void ready() {
		todoDAO = new TodoDAO();
	}
//	@Test
//	public void testInsert() throws Exception {
//		TodoVO vo = TodoVO.builder()
//				.tno(4l)
//				.title("4번입니다.")
//				.dueDate(LocalDate.of(2023, 06, 23))
//				.build();
//		todoDAO.insert(vo);
//		System.out.println("추가되었습니다");
//	}
//	@Test
//	public void testUpdate() throws Exception {
//		TodoVO vo = TodoVO.builder()
//				.tno(4l)
//				.title("ㄴㅁㅂㅈㄷㅂㅈㄷ")
//				.dueDate(LocalDate.now())
//				.finished(true)
//				.build();
//		todoDAO.update(vo);
//		System.out.println("수정되었습니다.");
//	}
//	@Test
//	public void testDelete() throws Exception {
//		Long tno = 4l;
//		todoDAO.delete(tno);
//		System.out.println("삭제되었습니다.");
//	}
	@Test
	public void testSelectAll() throws Exception {
		List<TodoVO> list = todoDAO.selectAll();
		list.forEach(vo -> System.out.println(vo));
	}

}
