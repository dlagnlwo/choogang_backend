package org.zerock.w1.todo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="todoRegisterControllerw1", urlPatterns = "/todo/registerw1")
public class TodoRegisterController extends HttpServlet{
	//서블릿이 요청한 view jsp 페이지를 대신 실행한다.
	private void fowardJSP(	String jspFilePath,
							HttpServletRequest req,
							HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher(jspFilePath);
		dispatcher.forward(req, res);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoRegisterController // doGet()");
		System.out.println("Method " + req.getMethod() + "입력화면을 보여줍니다");
		//get방식은 주소로 호출 post는 res.sendRedirect로 호출
		String jspPath = "/WEB-INF/todo/register.jsp";
		
		//실제 jsp 실행결과를 마지막으로 처리하는 것이 서블릿임을 확인
		//확인용 tmpReq와 tmpRes객체변수를 선언
		HttpServletRequest tmpReq = req;
		HttpServletResponse tmpRes = res;
		fowardJSP(jspPath, tmpReq, tmpRes);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TodoRegisterController2 // doPost()");
		System.out.println("Method : " + req.getMethod());
		String JspPath = "/WEB-INF/todo/result.jsp";
		fowardJSP(JspPath, req, res);
	}
}
