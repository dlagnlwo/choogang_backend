package org.zerock.jdbcex.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.jdbcex.domain.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import lombok.extern.log4j.Log4j2;
@Log4j2
@WebServlet(name = "todoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TodoService todoService = TodoService.INSTANCE;
	private final DateTimeFormatter DATE_FORMATTER =
			DateTimeFormatter.ofPattern("yyyy-MM-dd");

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//화면 요청
		log.info("/todo/register - GET ...");
		String goUrl = "/WEB-INF/todo/register.jsp";
		req.getRequestDispatcher(goUrl).forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("test/html; charset=utf-8");
		res.setCharacterEncoding("utf-8");
		TodoDTO todoDTO = TodoDTO.builder()
				//tno는 데이터베이스에서 자동증가로 만들었기 때문에
				//여기선 추가 안한다.
				.title(req.getParameter("title"))
				.dueDate(LocalDate.parse(req.getParameter("dueDate"), DATE_FORMATTER))
				.build();
		log.info("/todo/register - POST ...");
		log.info(todoDTO);
		
		//DB등록을 위해 TodoService호출
		//register는 Cleanup으로 예외처리 했기때문에 여기에서도 예외처리 해야함
		//register()메소드는 insert()가 있음.
		try {
			todoService.register(todoDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//데이터 등록을 마쳤으므로 자동으로 넘김
		res.sendRedirect("/todo/list");
	}

}
