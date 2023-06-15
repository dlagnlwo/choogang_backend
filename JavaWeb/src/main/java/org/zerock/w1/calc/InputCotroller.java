package org.zerock.w1.calc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputCotroller
 */
//calc/input주소로 들어오면 별명이 inputController인 서블릿이 동작한다.
//urlPatterns는 '매핑' 한다고 함.
@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputCotroller extends HttpServlet {

// 보안구역(WEB-INF)는 외부에서 접근하지 못하기 때문에 InputController객체를 통해
// 간접적으로 접근한다.
// 웹 요청이 발생하면 그 요청에 대한 요청객체와 응답객체를 보안구역에 넘겨주고
// input.jsp가 실행되도록 해야한다.
// 이때 이 기능을 수행하는 클래스가 ReqeustDispatcher클래스다.
// RequestDispatcher는 객체를 생성할 때 호출할 jsp파일이나 서블릿을 등록합니다.
// ex) request.getDispatcher("/WEB-INF/calc/input.jsp")
// 요청객체와 응답객체를 넘겨주면 등록된 호출객체가 실행된 결과를 응답객체를 통해
// 웹브라우저로 돌려줍니다.
// 쉽게말해 보안구역(WEB-INF)에 있는 jsp파일이나 서블릿을 
// ReqeustDispatcher클래스라는 중간 다리 통해 실행하게 해준다.

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/calc/input.jsp");
		dispatcher.forward(request, response);
	}
}
