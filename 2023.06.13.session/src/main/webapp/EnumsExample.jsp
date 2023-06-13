<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	ArrayList<String> list = new ArrayList<>();

	list.add("apple");
	list.add("melon");
	list.add("watermelon");
	list.add("kiwi");
	
	//Collections: 자바로 표현가능한 알고리즘자료형(ADT)
	Enumeration<String> e = Collections.enumeration(list);
	while(e.hasMoreElements()) {
		out.println("과일 이름: " + e.nextElement() + "<br />");
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