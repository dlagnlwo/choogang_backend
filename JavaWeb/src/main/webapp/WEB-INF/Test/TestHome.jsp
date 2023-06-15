<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력화면</title>
</head>
<body>
	<form action="/Test/calc" method="post">
		숫자1: <input type="number" name="num1"/><br />
		숫자2: <input type="number" name="num2"/><br />
		<button type="submit"> 결과 </button>
	</form>
</body>
</html>