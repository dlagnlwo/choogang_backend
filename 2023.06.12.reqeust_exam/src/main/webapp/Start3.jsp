<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start3.jsp</title>
</head>
<body>
	지금은 3페이지 입니다.<br /><br />
	<a href="Start4.jsp">4페이지</a>
	<% 
	response.sendRedirect("Start4.jsp");
	%>
</body>
</html>