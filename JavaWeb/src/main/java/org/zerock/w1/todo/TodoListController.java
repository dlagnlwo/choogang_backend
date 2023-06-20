package org.zerock.w1.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

//get방식 목록 화면 
@WebServlet(name="todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("/todo/list");
		
		//INSTANCE -> 상수
		List<TodoDTO> dto = TodoService.INSTANCE.getList();
		//list.jsp에서 ${list}로 list를 불러오면 됨
		req.setAttribute("list", dto);//이름은 list 값은 dto
		String jspPath = "/WEB-INF/todo/list.jsp";
		forward(jspPath, req, res);
		
		//ReqeustDispatcher 약식
//		req.getRequestDispatcher
//		("/WEB-INF/todo/list.jsp").forward(req, res);
	}
	private void forward(String Path,
						HttpServletRequest req,
						HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(Path);
		dispatcher.forward(req, res);
	}
}
