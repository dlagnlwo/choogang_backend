<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	String id, pw;	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	if(id.equals("aaa") && pw.equals("123")) {
		//쿠키 생성
		Cookie cookie = new Cookie("id", id);
		//쿠키 만료시간
		cookie.setMaxAge(60 * 10);
		//쿠키 보내기
		response.addCookie(cookie);
		response.sendRedirect("TestLoginHome.jsp");
	}else {
		out.println("<script>alert('로그인 실패'); </script>");
		out.println("<script>location.href='TestLogin.html'; </script>");
		//response.sendRedirect("TestLogin.html");
	}
%>

</body>
</html>