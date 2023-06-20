<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
자바식 처리: <%= request.getParameter("id") %> <br />
EL 표현식: ${param.id }
<p>
객체의 값이 같은가를 비교하고 싶으면 equals()메소드를 사용
</p>
<br />
자바코드를 사용한 비교<br />
== 연산자 사용 결과: <%= request.getParameter("id") == "seoul"%><br />
equals()메소드 사용 결과: <%= request.getParameter("id").equals("seoul")%>
<br /><br />
EL식을 사용한 비교<br />
EL표현식은 equals()메소드를 쓰지 않고 ==를 써도 됨 <br />
== 연산자를 사용: ${param.id =="seoul"} <br />
</body>
</html>