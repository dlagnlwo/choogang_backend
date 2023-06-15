package org.zerock.w1.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//name = "별명", urlPatterns="경로"
@WebServlet(name = "calcCotroller", urlPatterns = "/calc/makeResult")
public class CalcCotroller extends HttpServlet {
	
	//post: 주소에 보이지 않음
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//input.jsp과 연결
//		PrintWriter out = response.getWriter();
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		System.out.printf("num1: %s \n num2: %s", num1, num2);
//		int result = Integer.parseInt(num1) + 
//					Integer.parseInt(num2);
//		out.println("num1 + num2 = " + result);
		
		response.sendRedirect("index");
//		RequestDispatcher dispatcher = 
//				request.getRequestDispatcher
//				("/WEB-INF/calc/calcResult.jsp");
//		dispatcher.forward(request, response);
	}

}
