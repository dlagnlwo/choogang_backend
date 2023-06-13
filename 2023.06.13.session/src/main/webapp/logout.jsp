<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = "";
	id = (String)session.getAttribute("id");
	if(id != null){
		session.invalidate();
		Thread.sleep(3000);
		response.sendRedirect("loginForm.jsp");
	}
	
%>

</body>
</html>