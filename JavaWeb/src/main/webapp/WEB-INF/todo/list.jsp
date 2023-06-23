<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<form action="/todo/register" method="get">
		<ul>
			<c:forEach var="dto" items="${dtoList}">
				<li>${dto}</li>
			</c:forEach>
		</ul><br />
		   	<button type="submit">입력화면으로</button>
    </form>
</body>
</html>