<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 여기는 클라이언트 쿠키 삭제 부분 --%>
<%
	Cookie[] cookies = request.getCookies();
	String strName = "";
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			strName = cookies[i].getName(); //쿠키에 있는 키값을 불러옴
			if(strName.equals("cookieName")){
				//쿠기 내용 출력
				out.println("삭제된 쿠키의 이름: " + cookies[i].getName() + "<br />");
				out.println("삭제된 쿠키의 값: " + cookies[i].getValue());
				//쿠키 삭제 만료시간 0으로 설정
				cookies[i].setMaxAge(0);
				//삭제된 만료설정된 쿠키를 다시 응답객체에 추가변경
				response.addCookie(cookies[i]);
			}
		}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기는 클라이언트 쿠키 삭제</title>
</head>
<body>
	<h1>여기는 클라이언트, 쿠키 삭제</h1>
	<a href="cookietest.jsp">쿠키 테스트</a>
</body>
</html>