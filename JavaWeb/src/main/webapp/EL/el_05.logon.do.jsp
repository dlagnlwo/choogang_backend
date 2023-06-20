<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL을 이용한 로그인 예제</title>
</head>
<body>
	<h1>당신이 입력한 정보입니다. 고전적 방식 </h1><br />
	아이디: <%= request.getParameter("id") %><br />
	비밀번호: <%= request.getParameter("pwd") %><br />
	
	
	<h1>당신이 입력한 정보입니다. EL, JSTL 활용</h1><br />
	아이디: ${param.id }<br />
	비밀번호: ${param.pwd }<br />
</body>
</html>