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
	<form action="el_05.logon.do.jsp">
		<label for="userid">아이디: </label>
		<input type="text" name="id" id="userid"><br />
		<label for="userid">암 &nbsp; 호: </label>
		<input type="password" name="pwd" id="userpwd"><br />
		
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>