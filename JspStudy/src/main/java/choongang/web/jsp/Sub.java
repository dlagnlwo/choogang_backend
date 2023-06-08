package choongang.web.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sub
 */
@WebServlet("/Sub")
public class Sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int a;
	private int b;

    public Sub() {
        super();
        this.a = 200;
        this.b = 100;
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        
    	// HTML이 UTF-8 형식이라는 것을 브라우저에게 전달
    	response.setContentType("text/html; charset=utf-8");
    
    	// 서블릿을 통해 생성되는 HTML 파일의 인코딩을 UTF-8로 설정
    	response.setCharacterEncoding("utf-8");
    	
    	PrintWriter out = response.getWriter();
    	String num1 = request.getParameter("num1");
    	String num2 = request.getParameter("num2");
    	int result = Integer.parseInt(num1) -
    				Integer.parseInt(num2);
    	out.print(num1 + " - " + num2 + " = " + result);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	private int sub() {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum -= i;
		}
		return sum;
	}

}
