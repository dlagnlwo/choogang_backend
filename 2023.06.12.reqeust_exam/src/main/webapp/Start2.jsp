<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start2.jsp</title>
</head>
<body>
	지금은 2페이지 입니다.<br /><br />
	<a href="Start3.jsp">3페이지</a>
	<% 
	response.sendRedirect("Start3.jsp");
	%>
</body>
</html>