package org.zerock.jdbcex.service;

import org.modelmapper.ModelMapper;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.domain.TodoVO;
import org.zerock.jdbcex.util.MapperUtil;

import lombok.extern.log4j.Log4j2;

@Log4j2
public enum TodoService {
	INSTANCE;
	private TodoDAO dao;
	private ModelMapper modelMapper;
	
	//생성자에서 변수 초기화
	TodoService(){
		dao = new TodoDAO();
		modelMapper = MapperUtil.INSTANCE.get();
	}
	
	public void register(TodoDTO todoDTO) throws Exception {
		TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
//		System.out.println("todoVO : " + todoVO);
		log.info(todoVO);
		dao.insert(todoVO); //int를 반환하므로 예외처리 해야함
	}
}
