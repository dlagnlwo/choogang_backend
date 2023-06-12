<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//쿠키를 읽어오는 부분
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			String id = cookies[i].getValue();
			if(id.equals("aaa")){
				out.println(id + "님이 로그인에 성공하셨습니다." + "<br />");
			}
		}
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="TestLogout.jsp">로그아웃</a>
</body>
</html>