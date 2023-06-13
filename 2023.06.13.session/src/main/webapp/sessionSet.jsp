<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//키는 반드시 문자열("")이여야 함.
	session.setAttribute("sessionName", "sessionValue");
	session.setAttribute("asd", 12345);
	String[] fruitName = {"fruit1", "fruit2", "fruit3"};
	String[] fruitValue = {"사과", "감", "참외"};
	String[] Electronic = {"UHDTV", "세탁기"};
	double[] price = {1000000, 500000.50};
	
	for(int i = 0; i < fruitName.length; i++){
		session.setAttribute(fruitName[i], fruitValue[i]);
	}
	for(int i = 0; i < Electronic.length; i++){
		session.setAttribute(Electronic[i], price[i]);
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a {
		text-decoration: none;
		color: black;
		text-align: center;
	}
	a:hover {
		color: red;
		opacity: 0.9;
		transition: all 0.2s;
	}
</style>
</head>
<body>
	<h1> >> <a href="sessionGet.jsp">Session Get</a> << </h1>
</body>
</html>