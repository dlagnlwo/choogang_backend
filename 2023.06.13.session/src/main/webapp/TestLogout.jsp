<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()){
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		
		if(value.equals("qwe")){
			session.removeAttribute(name);
			out.println("로그아웃 된 아이디: " + value + "<br />");
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
	<h1><a href="TestSession.jsp"> 세션테스트 </a></h1>
</body>
</html>