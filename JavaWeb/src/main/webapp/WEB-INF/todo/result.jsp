<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
	<h1>여기는 result.jsp입니다.</h1>
	<h1>NUM1 = ${param.num1}</h1>
	<h1>NUM2 = ${param.num2}</h1>
	<h1>SUM = ${Integer.parseInt(param.num1) +
				Integer.parseInt(param.num2) }</h1>
</body>
</html>