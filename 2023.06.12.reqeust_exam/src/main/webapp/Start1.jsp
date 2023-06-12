<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start1.jsp</title>
</head>
<body>
	지금은 1페이지 입니다.<br /><br />
	<a href="Start2.jsp">2페이지</a>
	<% 
	response.sendRedirect("Start2.jsp");
	%>
	
	
</body>
</html>