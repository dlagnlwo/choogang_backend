<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if(id.equals("qwe") && pw.equals("123")){
		session.setAttribute("id", id);	
		response.sendRedirect("loginSuccess2.jsp");
	}else { %>
		<script>
			alert("로그인 실패");
			history.go(-1);
		</script>
	<%
	//response.sendRedirect("loginForm2.jsp");
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>