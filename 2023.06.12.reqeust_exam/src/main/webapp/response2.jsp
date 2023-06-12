<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response2</title>
</head>
<body>
	
	<%-- 앞의 데이터 내용을 비즈니스 로직의 의해서 처리하는 스크립트 --%>
	
<%
	String str = request.getParameter("age");
	int age = Integer.parseInt(str);
	
	if(age >= 20) {
		//response.sendRedirect("yes.jsp?age=" + age);
		out.println("<a href='yes.jsp?age='>성년입니다.</>");
	}else {
		//response.sendRedirect("no.jsp?age=" + age);
		out.println("<a href='no.jsp?age='>미성년자입니다.</>");
	}
%>
<br /><br />
현재 입력하신 나이는 <%= age %> 입니다.

</body>
</html>