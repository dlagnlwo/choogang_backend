<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 여기는 서버 --%>    
<%
	//처리 영역
	//쿠키 생성
	//쿠키는 항상 서버에서 생성한다.
	//1. 서버에서 쿠키 생성
	//	 쿠키는 정보를 가르키는 변수('key'라고 부름)
	//	 이 키에 저장된 데이터('value'라고 한다.)
	//2. response객체에 추가(addCookei(생성된쿠키객체))
	
	//쿠키 생성
	Cookie cookie = new Cookie("cookieName","cookieValue");
	
	//쿠키 만료시간 설정 
	cookie.setMaxAge(60*10); //60초 * 10분
	
	//쿠키를 클라이언트로 전송
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기는 서버</title>
</head>
<body>
	<h1>여기는 서버, 쿠키 생성</h1>
	<%-- 위에서 생성한 쿠키의 내용을 읽어오는 스크립트 링크 연결 --%>
	<a href="cookieget.jsp">쿠키 읽어오기</a>	
</body>
</html>