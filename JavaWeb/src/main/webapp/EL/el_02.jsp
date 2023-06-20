<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
정수형: ${ 1000 } <br />
실수형: ${ 10.10 } <br />
문자열형: ${ "hi" } <br />
논리형: ${ true } <br />

<%-- null은 값이 존재하지 않으므로 NPE 에러가 나옴 --%>
null: ${ null } <br />
</body>
</html>