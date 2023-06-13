<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()){
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		if(value.equals("qwe")) {
			out.println(value + "님 안녕하세요." + "<br />");	
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공 페이지</title>
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
	<h1> >><a href="logout2.jsp">로그아웃</a> <<</h1>
</body>
</html>