<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산된 화면</title>
</head>
<body>
	<div>
		<h1> num1 = ${Integer.parseInt(param.num1)}</h1>
		<h1> num2 = ${Integer.parseInt(param.num2)}</h1>
	</div>
	
	<div>
		<h1> sum = ${Integer.parseInt(param.num1) +
					Integer.parseInt(param.num2) }</h1>
	</div>
</body>
</html>