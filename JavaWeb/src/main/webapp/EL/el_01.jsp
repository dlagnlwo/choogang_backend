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
<c:set var="num" value="10000" scope="page"/>
<c:catch var="e">
	<%
		int i = 10;
		int j = 11;
		int result = i + j;
	%>
	<%= result %>
</c:catch>
<c:if test="${e != null}">
	에러메시지: ${e.message}
</c:if>
<br />
<c:set var="price" value="25000" scope="page"/>
<c:choose>
	<c:when test="${ price >= 20000 }">
		${ price }가 20000보다 크거나 같습니다. 
	</c:when>
	<c:when test="${ price < 20000 }">
		${ price }가 20000보다 작습니다.
	</c:when>
	<c:otherwise>
		price 값이 없습니다.
	</c:otherwise>
</c:choose>
</body>
</html>