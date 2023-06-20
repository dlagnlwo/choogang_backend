<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단 계산기</title>
</head>
<body>
	<form action="el_07.calcResult.jsp" method="get">
		숫자1: <input type="number" name="num1"/><br />
		숫자2: <input type="number" name="num2"/><br />
		연산자: <input type="text" name="op" placeholder="+" size="1"/><br />
		<button type="submit"> 결과 </button>
	</form>
</body>
</html>