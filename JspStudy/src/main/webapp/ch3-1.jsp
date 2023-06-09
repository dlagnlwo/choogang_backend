<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- %!는 전역변수이기 때문에 재사용이 가능함. --%>
<%!
	int i = 10;
	String str = "abc";
	
	private int sum(int a, int b){
		return a + b;
	}
%>


<%-- <%는 지역변수, 주로 반복문쓸때 사용--%>
<% for(int s = 1; s <= 6; s++){ %>
	<h<%= s %>>안녕하세요</h<%= s %>>
<% } %>

<p>
<% 	String msg = "";
	for(int i = 1; i <= 6; i++){ 
		msg += ("<h" + i + "> msg </h" + i + ">");
	} 
%>
<%= msg %>

<%-- <% %>는 자바표현과 html표현이 공존함. --%>

		
<%-- 
<%= i %><br />
<%= str %><br />
<%= sum(5, 7) %>
 --> --%>


<%-- View에는 로직을 최대한 안넣어야됨. --%>
</p>
<%= 10 %> + <%= 20 %> = <%= sum(10, 20) %> <br />
<%-- 위의 JSP 표현식 태그 코드를 서블릿 방식으로 변환해보기 --%>
<% 
	out.println("10" + " + " + "20" + " = " + sum(10, 20));
%>
	
</body>
</html>