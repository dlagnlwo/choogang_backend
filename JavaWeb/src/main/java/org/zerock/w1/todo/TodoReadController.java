package org.zerock.w1.todo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet(name = "todoReadControllerw1", urlPatterns = "/todo/readw1")
public class TodoReadController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoReadController >> doGet || /todo/read");
		
		// /todo/read?tno=123
		Long tno = Long.parseLong(req.getParameter("tno"));
		TodoDTO dto = TodoService.INSTANCE.get(tno);
		
		//tno를 보관
		req.setAttribute("dto", dto);
		String path = "/WEB-INF/todo/read.jsp";
		req.getRequestDispatcher(path).forward(req, res);
		
	}

}
