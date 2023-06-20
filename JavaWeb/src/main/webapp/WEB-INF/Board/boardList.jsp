<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.mysql.jdbc.list.dto.Board" %>    
<%@ page import="java.util.List"%>
<%
	List<Board> boardList = (List)request.getAttribute("boardList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>아이디</th>
		<th>조회수</th>
		<th>작성일</th>
	</tr>
	<%	for(int i=0; i<boardList.size(); i++) { %>
	<tr>
		<td><%=boardList.get(i).getBno()%></td>
		<td><%=boardList.get(i).getBtitle() %></td>
		<td><%=boardList.get(i).getBcontent() %></td>
		<td><%=boardList.get(i).getBwriter() %></td>
		<td><%=boardList.get(i).getBdate() %></td>
	</tr>
	<%	} %>
</table>
</body>
</html>