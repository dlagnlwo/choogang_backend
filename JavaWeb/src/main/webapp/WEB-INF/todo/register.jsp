<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/todo/register2" method="get">
		Get : 
		<input type="text" name="num1" value="1000"/>
		<input type="text" name="num2" value="2000"/>
		<button type="submit">get등록 처리</button>
	</form>
	<br />
	<form action="/todo/register2" method="post">
		Post: 
		<input type="text" name="num1" value="1000"/>
		<input type="text" name="num2" value="2000"/>
		<button type="submit">post등록 처리</button>
	</form>
</body>
</html>