package org.zerock.w.calc.plus;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calcPlus", urlPatterns = "/calc/Operator")
public class CalcPlus extends HttpServlet {

	protected void forward(String path, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dis = req.getRequestDispatcher(path);
		dis.forward(req, res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("메소드 " + req.getMethod());
		String path = "";
		
		String oper = req.getParameter("oper");
		switch(oper) {
		case "+" :
			path = "/WEB-INF/calc/SumCalc.jsp";
			forward(path, req, res);
		case "-" :
			path = "/WEB-INF/calc/SubCalc.jsp";
			forward(path, req, res);
		case "*" :
			path = "/WEB-INF/calc/MulCalc.jsp";
			forward(path, req, res);
		case "/" :
			path = "/WEB-INF/calc/DivCalc.jsp";
			forward(path, req, res);
		}	
	}
}
