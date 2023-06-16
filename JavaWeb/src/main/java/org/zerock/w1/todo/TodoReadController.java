package org.zerock.w1.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TodoReadController")
public class TodoReadController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoReadController // doGet()");
		req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, res);
	}

}
