package org.zerock.w1.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//get방식 목록 화면 
@WebServlet(name="todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("/todo/list");
		
		//ReqeustDispatcher 약식
		req.getRequestDispatcher
		("/WEB-INF/todo/list.jsp").forward(req, res);
	}
}
