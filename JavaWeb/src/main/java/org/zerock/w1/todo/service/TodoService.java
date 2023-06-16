package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.zerock.w1.todo.dto.TodoDTO;
//enum타입으로 클래스를 작성하면 객체를 정해진 수만큼만 생성할 수 있다.
public enum TodoService { 
	//싱글톤 패턴
	INSTANCE; 
	
	public void register(TodoDTO todoDTO) {
		System.out.println("DEBUG " + todoDTO);
	}
	
	//'<>'는 Generic(제네릭)이라고 함.
	//제네릭은 데이터 처리하기의 일반화
	//보통 <>안에는 클래스 이름이 들어간다.
	public List<TodoDTO> getList(){
		//todoDTO의 목록이 리턴되어야 함
		//데이터를 생성시키기위해 스트림클래스를 사용하여 TodoDTO객체를
		//반복하면서 만들어 내고 있다.
		
		//원래는 for문으로 반복했음
		//지금은 객체를 반복해야함.
		//그렇기때문에 스트림을 사용하여 반복시킴
		List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
			TodoDTO dto = new TodoDTO();
			dto.setTno((long)i); //멤버변수가 long형이므로 long으로 강제형변환
			dto.setTitle("Todo..." + i);
			dto.setDueDate(LocalDate.now()); //생성한 시점의 날짜
			return dto;
		}).collect(Collectors.toList());//스트림을 List로 바꿔줌
		
		return todoDTOS;
	}
}
