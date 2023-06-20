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
<%-- 1. 화면에 출력하기 --%> 
<c:out value="Hello World!"/><br />
<%-- 2. 변수설정하기 <c:set var="변수명" value="설정값" scope="변수범위"  --%>
<c:set var="price" value="10000" scope="page"/>
${price} <br />
변수의 발견순서 : page -> request -> session -> application
<br />
<%-- 위에서 설정한 변수를 삭제한다. 
	<c:remove var="price">
--%>
<%-- try - catch구문과 비슷함 
	에러가 나면 상위태그로 처리를 throwable
	<c:catch var="e">
		처리
	</c:catch>
	<c:if test="${e != null}">
		에러메시지: ${e.massage}
	</c:if>
 --%>
<%--에러가 나면 e라는 변수에 넣어라 --%>
<c:catch var="e">
 	<% 
 		int num1 = 100;
 		int num2 = 0;
 		int result = num1 / num2;
 	%>
 	<%= result %>
</c:catch> 
<c:if test="${e != null}">
	${e.message }
</c:if>
<br />
<%-- 한번더 연습 --%>
<%-- <c:set>: 변수생성
var: 변수이름, value: 값, scope: 
 --%>
<c:set var="price" value="20000" scope="page"/>
<%-- price키의 값이 500보다 큰가? --%>
<c:if test="${price > 500}">
	price가 500보다 큽니다.
</c:if>
<br />
<c:if test="${price > 500}" var="priceCheck" scope="page"/>
<%-- 맞으면 true 아니면 false --%>
<c:out value="${priceCheck}"/>
<br />
<c:set var="price" value="100000" scope="page"/>
<c:choose>
	<c:when test="${price <= 10000}">
		price가 ${price}보다 작거나 같습니다.
	</c:when>
	<c:when test="${price > 10000}">
		price가 ${price}보다 큽니다.
	</c:when>
	<c:otherwise>
	</c:otherwise>
</c:choose>
<c:set var="a" value="${256}" scope="page"/>
<c:set var="result" value="${a % 3}" scope="page"/>

<c:choose>
	<c:when test="${result == 1 || salary == 2 }">
		${a}는 3의 배수가 아니다.
	</c:when>
	<c:otherwise>
		${a} 는 3의 배수이다,
	</c:otherwise>
</c:choose>
</body>
</html>