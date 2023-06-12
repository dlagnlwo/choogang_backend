<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 
<%
	//로그인 유저만 들어올 수 있도록 보안 기능 구현
	//지금은 간단하게
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			String id = cookies[i].getValue();
			if(id.equals("abcde")) {
				out.println(id + "님이 로그인에 성공하셨습니다." + "<br />" + "<br />");
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공 페이지</title>
<style>
	a {
		border: 1px solid black;
		text-decoration: none;
		color:black;
	}
	a:hover {
		opacity: 0.9;
		trasition: all 0.2s;
		color: red;
	}
</style>
</head>
<body>
	<a href="logout.jsp"> 로그아웃 </a>
</body>
</html>