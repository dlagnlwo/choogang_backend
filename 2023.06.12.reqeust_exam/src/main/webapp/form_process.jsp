<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.html 처리하기</title>
</head>
<body>

	<%!
		String name, id, pw, hobby[], major;
	%>
	<%-- 요청정보로 부터 양삭의 입력값 추출
		1. 양식을 읽어오는 문자코드체계 설정 --%>
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		hobby = request.getParameterValues("hobby");
		major = request.getParameter("major");
	%>
	
	<%

	%>
	이름 : <%= name %><br />
	아이디 : <%= id %><br />
	비밀번호 : <%= pw %><br />
	취미 : <%= Arrays.toString(hobby) %><br />
	전공 : <%= major %>
	
	
</body>
</html>