package choongang.web.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public member() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        
    	// HTML이 UTF-8 형식이라는 것을 브라우저에게 전달
    	response.setContentType("text/html; charset=utf-8");
    
    	// 서블릿을 통해 생성되는 HTML 파일의 인코딩을 UTF-8로 설정
    	response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		MemberDAO memberdao = new MemberDAO();
		List<MemberVO> list = memberdao.listMembers();

		for(int i = 0; i < list.size(); i++) {
			MemberVO board = list.get(i);
			int bno = board.getBno();
			String btitle = board.getBtitle();
			String bwriter = board.getBwriter();
			Date bdate = board.getBdate();
		}	
		
		String no = request.getParameter("bno");
		String btitle = request.getParameter("btitle");
		String bwriter = request.getParameter("bwriter");
		String bdate = request.getParameter("bdate");
		
		out.print(no + btitle + bwriter + bdate);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
