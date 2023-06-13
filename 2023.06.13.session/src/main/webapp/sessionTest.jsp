<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
    
<%
	//Enumeration 객체 사용
	String name, value;
	
	
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()) {
		name = e.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("키이름: " + name + "<br />" + 
					"키값: " + value + "<br />");
		if(name.equals("asd")) {
			session.removeAttribute(name);
		}
	}
	if(request.isRequestedSessionIdValid()) {
		out.println("세션이 아직 있음");
	}else {
		session.invalidate();
		out.println("세션 전체 삭제");
	}
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>