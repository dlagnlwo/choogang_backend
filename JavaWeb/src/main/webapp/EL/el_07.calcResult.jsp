<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단 계산기 결과</title>
</head>
<body>
<h1>고전적인 방식 </h1><br />
<%
	String str1 = request.getParameter("num1");
	String str2 = request.getParameter("num2");
	String op = request.getParameter("op");
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);

	int sum = num1 + num2;
	int sub = num1 - num2;
	int mul = num1 * num2;
	int div = num1 / num2;
	
	if(op.equals("+")) {
		out.println(sum);	
	}else if(op.equals("-")){
		out.println(sub);
	}else if(op.equals("*")){
		out.println(mul);
	}else if(op.equals("/")){
		out.println(div);
	}else {
		out.println("잘못 입력");
	}

%>

<h1>EL표현언어 방식</h1><br />
${param.num1} + ${param.num2} = ${param.num1 + param.num2}

<c:catch>
	<c:when test="${param.num1 >= 50 }">
		num1은 50보다 크거나 같습니다.
	</c:when>
	<c:when test="${param.num1 < 50 }">
		num1은 50보다 작습니다.
	</c:when>
	<c:otherwise>
	</c:otherwise>
</c:catch>
	

</body>
</html>