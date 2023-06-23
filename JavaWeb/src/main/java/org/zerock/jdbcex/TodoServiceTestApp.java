package org.zerock.jdbcex;


import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.service.TodoService;


class TodoServiceTestApp {
	private TodoService todoService;
	
	@BeforeEach
	public void ready() {
		todoService = TodoService.INSTANCE; //생성자 호츌
	}

	@Test
	public void testRegister() throws Exception {
		TodoDTO todoDTO = TodoDTO.builder()
				.title("JDBC Test Title")
				.dueDate(LocalDate.now())
				.build();
		todoService.register(todoDTO);
	}
}
