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
자바코드를 사용한 NPE(Null Pointer Exception) 처리<br />
<%
	if(request.getParameter("id") != null) {%>
		==연산자 사용 결과: <%= request.getParameter("id") == "seoul" %><br />
		equals() 사용 결과: <%= request.getParameter("id").equals("seoul") %><br />
			
	<%}else {%>
	id를 전달해 주세요 <br />
	
	<%} %>
EL표현식으로 처리하면<br />
param은 값을 반드시 리턴하므로 NPE예외가 발생하지 않는다.<br />
</body>
</html>