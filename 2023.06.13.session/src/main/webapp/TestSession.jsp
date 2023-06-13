<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	Enumeration e = session.getAttributeNames();
	int count = 0;
	while(e.hasMoreElements()){
		count++;
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		
		out.println("아이디: " + value + "<br />");
	}
	if(count == 0){
		out.println("현재 로그인된 아이디가 없습니다.");
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
	<h1><a href="TestLoginForm.jsp">로그인 창으로 이동</a></h1>
</body>
</html>