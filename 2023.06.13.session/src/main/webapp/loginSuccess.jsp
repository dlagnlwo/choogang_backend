<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a {
		text-decoration: none;
		color: black;
	}
	a:hover {
		opacity: 0.9;
		trasition: all 0.2s;
		color: red;
	}
</style>
</head>
<body>
<%
	String id = "";

	try {
		id = (String)session.getAttribute("id");
		if(id == null || id.equals("")){
			response.sendRedirect("loginForm.jsp");
		}else {
			out.println("현재 로그인한 아이디 : " + id);
		}
	}catch(Exception e){
		
	}	
%>
<br />
로그인 성공.
<br />
<h1> >> <a href="logout.jsp">3초 뒤 로그아웃</a> << </h1>
</body>
</html>