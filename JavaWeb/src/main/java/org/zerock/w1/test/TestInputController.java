package org.zerock.w1.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//첫번째
//처음은 doGet방식으로 jsp파일에 전달해줘야함.
//전달할 때는 RequestDispatcher클래스를 활용해 전달해준다.
//name = "별명" urlPatterns = "경로"
@WebServlet(name = "testInputController", urlPatterns = "/Test/input")
public class TestInputController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/Test/TestHome.jsp");
		dispatcher.forward(request, response);
	}
}
