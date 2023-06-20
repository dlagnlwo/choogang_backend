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
	<form action="el_04.jsp">
		<input type="checkbox" name="season" value="spring"/>봄
		<input type="checkbox" name="season" value="summer"/>여름
		<input type="checkbox" name="season" value="fall"/>가을
		<input type="checkbox" name="season" value="winter"/>겨울
		<br />
		<input type="submit" value="출력"/>
	</form>
</body>
</html>