<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		private final String JDBC_URL = "jdbc:mysql://localhost/thisisjava";
		private final String USER = "root";
		private final String PASS = "mariadb";
	%>

	<% 
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
		}catch (Exception e){
			
		}
	%>
	
	
	
</body>
</html>