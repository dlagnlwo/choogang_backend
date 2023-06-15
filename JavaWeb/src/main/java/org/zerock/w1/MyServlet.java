package org.zerock.w1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet: 웹 주소로 접근할 uri지정
// 하나만 있는 경우는 옵션키를 생략할 수 있다.
// 두개이상이면 반드시 키=값, 형식으로 명시해야한다.
// name : 실제 서블릿 호출 uri
// urlPatterns: 서블릿 호출 uri의 별명
// @WEbServlet(name= "myServlet", urlPatterns = "/w1/Servlet테스트")
// name은 index.jsp로 들어가는거 url은 이 서블릿으로 이동
@WebServlet(name = "MyServlet", urlPatterns = "/my")	
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1> MyServlet </h1>");
		out.println("</body></html>");
	
		
	}


}
