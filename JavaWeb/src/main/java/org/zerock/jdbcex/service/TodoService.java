package org.zerock.jdbcex.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.domain.TodoVO;
import org.zerock.jdbcex.util.MapperUtil;

import lombok.extern.log4j.Log4j2;

//서비스가 프로젝트 첫번째 순서
@Log4j2 //@Slf4j 둘중에 하나만 사용해야함.
public enum TodoService {
	INSTANCE;
	//서비스에는 DAO, Mapper를 멤버변수로 저장
	private TodoDAO dao;
	private ModelMapper modelMapper;
	
	//생성자에서 변수 초기화
	TodoService(){
		dao = new TodoDAO();
		modelMapper = MapperUtil.INSTANCE.get();
	}
	
	public void register(TodoDTO todoDTO) throws Exception {
		TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
		log.info(todoVO);
		dao.insert(todoVO);
	}
	public List<TodoDTO> listAll() throws Exception {
		List<TodoVO> voList = dao.selectAll();
		
		//TodoDTO에 있는 데이터가 vo로 전달
		//stream을 쓴다는건 반복이 있다는 뜻
		//.map(키, 값)	
		//vo -> dto에게 줘야하는 코드
		List<TodoDTO> dtoList = voList.stream()
				//map은 스트림의 한 항목을 가져온다
				//modelMapper는 중간다리 역할을 한다.
				.map(vo -> modelMapper.map(vo, TodoDTO.class))
				//collect로 모으고 리스트로 만들어라
				.collect(Collectors.toList());
		
		log.info(dtoList);
		return dtoList;
	}
}
