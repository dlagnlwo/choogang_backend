package org.zerock.jdbcex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import lombok.extern.log4j.Log4j2;

@WebServlet(name = "todoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet{
	//싱글톤 패턴 INSTANCE를 불러옴
	private TodoService todoService = TodoService.INSTANCE;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		log.info("todo list.............");
//		log.error("에러");
//		log.warn("61412156");
//		log.debug("버그잡기");
//		log.trace("자세한 오류");
		try {
			List<TodoDTO> dtoList = todoService.listAll();
			//req.setAttribute(키, 값);
			req.setAttribute("dtoList", dtoList);
			String path = "/WEB-INF/todo/list.jsp";
			req.getRequestDispatcher(path).forward(req, res);
		}catch (Exception e) {
			log.error(e.getMessage()); //에러메시지
			//전에 썼던 throw new Exception : 강제로 에러 나오게 함.
			throw new ServletException("list error"); 
		}
		
	}
}
