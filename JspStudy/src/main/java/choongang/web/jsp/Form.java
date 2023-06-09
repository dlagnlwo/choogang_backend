package choongang.web.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import choonang.web.jsp.ch2.domain.*;


@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Form() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		actionDo(request, response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//요청을 처리하는 순서
		//1. 데이터 호환을 위한 문자코드체계 설정 UTF-8로 설정
		//2. 요청브라우저의 요청값 분리, 이 데이터를 바탕으로 비즈니스로직 전개
		//3. 비즈니스로직 실행
		//4. 처리된 결과를 이용하여 응답객체에 데이터를 보내거나 다른 개게에 필터
		// 또는 파이프 처리(후처리)
		
		// 문자코드체계 설정
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		// 요청값 가져오기
		// 자바변수 이름과 폼의 요청값 변수이름은 다르게해야 좋음.
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		
		User user = new User(name, id, password, hobby, major);
		
		writeHtml(response, user);
//		writeHtml(response, name, id, password, hobby, major);	
	}
	public void writeHtml( HttpServletResponse response,
							User user) throws IOException {
		
		String name = user.getName();
		String id = user.getId();
		String password = user.getPassword();
		String[] hobby = user.getHobby();
		String major = user.getMajor();
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String msg = """
			<html>
				<head>
				<style>
					div {text-align: center}
				</style>
				</head>
				<body>
					<div>이름 : %s </div><br />
					<div>아이디 : %s </div><br />
					<div>비밀번호 : %s </div><br />
					<div>취미 : %s </div><br />
					<div>전공 : %s </div><br />
				</body>
			</html>
		""".formatted(name, id, password, Arrays.toString(hobby), major);
		
		out.print(msg);
//		out.print("<html><head><style>");
//		out.print("div { text-align: center}");
//		out.print("</style></head>");
//		out.print("<body>");
//		out.println("<div>이름: " + name + "<br />" + "<br />");	
//		out.println("<div>아이디: " + id + "<br />" + "<br />");
//		out.println("<div>취미: " + Arrays.toString(hobby) + "<br />" + "<br />");
//		out.println("<div>전공: " + major);
//		out.print("</body></html>");
		
		out.close();
	}
//	public void writeHtml(HttpServletResponse response, User user) throws IOException {
//		writeHtml (response, 
//					user.getName(),
//					user.getId(),
//					user.getPassword(),
//					user.getHobby(),
//					user.getMajor());
//	}

}
