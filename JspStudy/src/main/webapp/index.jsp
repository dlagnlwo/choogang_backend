<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	a {
		border : 0px solid black;
		text-decoration-line : none;
		font-size : 2rem;
		color : black;
	}
	a:hover {
		opacity : 0.5;
		transition: all 0.2s;
		color : red;
	}
</style>
</head>
<body>
<!-- 
시작페이지는 기본적으로 index라는 이름을 사용합니다.
윈도우계열에서는 default라는 이름을 쓰기도 합니다.,
index라는 이름을 가지고 확장자가 html 또는 htm을 정적시작페이지라고 합니다.
이것은 클라이언트 요청이기 때문에 페이지 소스 보기에서 보입니다.
 -->
 <%--
 JSP의 주석은 두종류가 있습니다.
 HTML 주석과 서버주석
 JSP스크립트 코드를 사용할 때 자바주석
 코드안에서는 //, /* ~ */
 모두 사용할 수 있습니다.
 
 백엔드 태그(%로 구분) 밖에서는
 <!-- html 주석 -->
 %-- 서버주석 %-- 두개로 사용합니다.
  --%>
  
<%-- 보여지는건 index.jsp 안보여지는건 서버 파일 hello.jsp --%>
	
<%-- action = "add" : 뒤에 확장자가 없는 경우
					  현재위치(실행한 jsp파일과 같은위치에서 시작)의 add라는
					  웹서비스를 실행하라는 의미입니다. 보통 웹서비스는 서블릿을 의미하고
					  자바클래스를 의미합니다. --%>	
	<a href = "add.jsp">add.jsp로 이동</a></br>
	<a href = "sub.jsp">sub.jsp로 이동</a></br>
	<a href = "mul.jsp">mul.jsp로 이동</a></br>
	<a href = "div.jsp">div.jsp로 이동</a></br>
	<a href = "conn.jsp">conn.jsp로 이동</a>
</body>
</html>