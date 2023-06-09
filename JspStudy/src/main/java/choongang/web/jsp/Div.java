package choongang.web.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Div")
public class Div extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Div() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        
    	// HTML이 UTF-8 형식이라는 것을 브라우저에게 전달
    	response.setContentType("text/html; charset=utf-8");
    
    	// 서블릿을 통해 생성되는 HTML 파일의 인코딩을 UTF-8로 설정
    	response.setCharacterEncoding("utf-8");
    	PrintWriter out = response.getWriter();
    	//html에서 요청(클라이언트)하니까 request가 되어야 함.
    	
    	//div.jsp에서 input에 name="first"를 갖고왔음.
    	String first = request.getParameter("first"); 
    	String last = request.getParameter("last");
    	double result = Integer.parseInt(first) / Integer.parseInt(last);
    	
    	out.print(first + " / " + last + " = " + result);
    	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
