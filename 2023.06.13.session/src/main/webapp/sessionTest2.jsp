<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>   
<%
	Enumeration e = session.getAttributeNames();
	int count = 0;
	while(e.hasMoreElements()){
		count++;
		String name = e.nextElement().toString();
		String value = (String)session.getAttribute(name);
		
		out.println("name : " + name + "<br />" );
		out.println("value : " + value + "<br />" );
	}
	if(count == 0) {
		out.println("해당 세션 삭제");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>