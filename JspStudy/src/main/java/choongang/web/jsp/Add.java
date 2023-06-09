package choongang.web.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int a;
    private int b;
    
    public Add() {
        super();
        this.a = 100;
        this.b = 200;
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        
    	// HTML이 UTF-8 형식이라는 것을 브라우저에게 전달
    	response.setContentType("text/html; charset=utf-8");
    
    	// 서블릿을 통해 생성되는 HTML 파일의 인코딩을 UTF-8로 설정
    	response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();
//		String first = request.getParameter("first");
//		String last = request.getParameter("last");
//		int result = Integer.parseInt(first) + 
//					Integer.parseInt(last);
//		out.print(first + " + " + last + " = " + result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String msg = "" + add();
		doGet(request, response);
//		response.getWriter().append(msg);
		out.print(msg);
	}
	protected void p(String msg) {
		System.out.print(msg);
	}
	protected void pl(String msg) {
		p(msg + "\n");
	}
	private int add() {
		//var은 유지보수 측면에서 유용하기 때문에 var을 사용하는것이 좋음.
		var sum = 0;
		for (var i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

}
