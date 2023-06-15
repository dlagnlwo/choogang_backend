package org.zerock.w1.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "testCalcController", urlPatterns = "/Test/calc")
public class TestCalcController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int result = Integer.parseInt(num1) +
				Integer.parseInt(num2);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher
				("/WEB-INF/Test/TestCalc.jsp");
		dispatcher.forward(request, response);
	}

}
