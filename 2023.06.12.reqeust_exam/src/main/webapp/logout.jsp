<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			String id = cookies[i].getValue();
			if(id.equals("abcde")){
				//쿠키를 만료
				cookies[i].setMaxAge(0);
				//만료시킨 쿠키들을 덮어쓰기
				response.addCookie(cookies[i]);
			}
		}
	}
	
	//로그아웃을 했으므로 시작페이지 login.html로 자동이동
	//!!!!!!!!!!!!!!!!!!!!!자동으로 이동!!!!!!!!!!!!!!!!!!!!!!!!!!
	response.sendRedirect("login.html");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 페이지</title>
</head>
<body>
	
</body>
</html>