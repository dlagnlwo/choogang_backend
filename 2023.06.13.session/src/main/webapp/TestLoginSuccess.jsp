<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    

<%
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()){
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		
		if(value.equals("qwe")){
			out.println(value + "님이 로그인했습니다. <br />");
		}else {
			response.sendRedirect("TestLoginForm.jsp");
		}
	}
%>
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
	<h1>>> <a href="TestLogout.jsp">로그아웃</a> <<</h1>
</body>
</html>