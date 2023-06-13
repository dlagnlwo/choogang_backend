<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()){
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		if(value.equals("qwe")) {
			session.removeAttribute(name); //특정 세션 요소 삭제
		}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 페이지</title>
</head>
<body>
	세션의 항목을 살펴봅니다.<br />
	세션항목중에서 id가 정말 삭제되었는지 알려줍니다. <br />
	<a href="sessionTest2.jsp"> 세션테스트 </a>
</body>
</html>