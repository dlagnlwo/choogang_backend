<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/calc/makeResult" method="post">
		<input type="number" name="num1"/>
		<input type="number" name="num2"/>
		<button type="submit">SEND</button>
	</form>
</body>
</html>