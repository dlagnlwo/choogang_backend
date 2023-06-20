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
\${5 + 2} : ${5 + 2}<br />
\${5 - 2} : ${5 - 2}<br />
\${5 * 2} : ${5 * 2}<br />
\${5 / 2} : ${5 / 2}<br />
\${5 mod 2} : ${5 mod 2}<br />
\${5 > 2} : ${5 > 2}<br />
\${5 gt 2} : ${5 gt 2}<br />
\${(5 > 2 ? 5 : 2)} : ${(5 > 2) ? 5 : 2}<br />
\${5 gt 2} || \${5 lt 2} : (${5 > 2} || $(5 < 2))<br />	
<%
	String input = null;
%>
<%
	if(input == null) {%>
		현재 input은 ${empty input}		
<%}%>
<br />
<c:if test="${empty input}">
	input은 null입니다.
</c:if>
<br />
\${ empty input } : ${ empty input }<br />
</body>
</html>