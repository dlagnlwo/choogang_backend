package apple.orange.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 요청이 들어오면 그 요청을 요청 서블릿이 처리하기 전에 또는 서블릿 처리후에
 * 마지막 추라처리를 하는 기능
 * 웹브라우저 요청 -> 필터 -> 서블릿 -> JSP뷰 -> 정리필터
 */
@WebServlet("/encoding")
public class EncodingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    	throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String place = request.getParameter("place");

		out.print("이름은 "+name+"<br>");
		out.print("나이는 "+age+"<br>");
		out.print("장소는 "+place+"<br>");
		out.print("<hr />");
	}

}

