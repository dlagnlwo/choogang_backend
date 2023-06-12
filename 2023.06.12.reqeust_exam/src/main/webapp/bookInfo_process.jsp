<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 정보(서버)</title>
</head>
<body>
<%! String title;
	String publisher;
	String price;
	Double total;
%>
	
<%
	request.setCharacterEncoding("UTF-8");
	title = request.getParameter("book_title");
	publisher = request.getParameter("book_publisher");
	price = request.getParameter("book_price");
	
	total = Integer.parseInt(price) * 0.1;
	
%>

책 제목: <%= title %><br />
책 출판사: <%= publisher %><br />
책 가격: <%= price %><br />
부가세 포함 가격: <%= total %>
</body>
</html>