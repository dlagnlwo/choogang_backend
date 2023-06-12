<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Cookie[] cookies = request.getCookies();

	for(int i = 0; i < cookies.length; i++){
		out.println("<br />" + "cookies[" + i + "] name : " + cookies[i].getName() + "<br />");
		out.println("cookies[" + i + "] value : " + cookies[i].getValue());
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기는 쿠키 테스트</title>
</head>
<body>
	<h1>여기는 쿠키 테스트</h1>
	<a href="cookieset.jsp">쿠키 생성</a><br /><br />
	<a href="cookieget.jsp">쿠키 가져오기</a><br /><br />
	<a href="cookiedelete.jsp">쿠키 삭제</a>
</body>
</html>