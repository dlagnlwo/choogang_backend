package org.zerock.w1.todo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "todoRegisterController2", urlPatterns = "/todo/register2")
public class TodoRegisterController2 extends HttpServlet {
	private void forwardJSP(String jspFilePath, 
							HttpServletRequest req,
							HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(jspFilePath);
		dispatcher.forward(req, res);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoRegisterController2 // doGet()");
		System.out.println("Method " + req.getMethod());
		String JspPath = "/WEB-INF/todo/result.jsp";
		forwardJSP(JspPath, req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoRegisterController2 // doPost()");
		System.out.println("Method " + req.getMethod());
		String JspPath = "/WEB-INF/todo/result.jsp";
		forwardJSP(JspPath, req, res);
	}
}
