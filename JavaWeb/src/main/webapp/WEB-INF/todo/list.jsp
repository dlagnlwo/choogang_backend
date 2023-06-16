<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<form action="/todo/register" method="get">
		<h1>목록 화면 입니다.</h1>
		${list} <br />
		<button type="submit">등록화면으로</button>
	</form>
</body>
</html>