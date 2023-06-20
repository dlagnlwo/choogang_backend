package org.zerock.w.calc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calc")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("메소드 : " + req.getMethod());
		String path = "/WEB-INF/calc/ViewCalc.jsp";
		forward(path, req, res);
	}
	protected void forward(String path, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(path);
		dispatcher.forward(req, res);
	}
}
