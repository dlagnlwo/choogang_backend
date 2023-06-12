<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	//여기는 변수 이름만 저장.
	String id, pw;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>

<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	if(id.equals("abcde") && pw.equals("12345")){
		//로그인에 성공한다면 쿠키에 저장
		//요청한 id를 여기에있는 id로 저장
		Cookie cookie = new Cookie("id", id);
		//쿠키 유지 시간 설정
		cookie.setMaxAge(60); //60초  //10분 = 60 * 10
		//쿠키를 클라이언트에 보내기
		response.addCookie(cookie);
		response.sendRedirect("loginHome.jsp"); //사용자페이지로 이동
	}else {
		out.println("<script>alert('로그인 실패');</script>");
		out.println("<script>location.href='login.html';</script>");
		//send는 위 코드가 순차적으로 진행되지 않고 실행하기 때문에 script부분은 실행x
		//response.sendRedirect("login.html");
	}
%>


</body>
</html>