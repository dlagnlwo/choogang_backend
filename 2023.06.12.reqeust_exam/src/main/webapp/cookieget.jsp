<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 여기는 클라이언트 --%>    
<%
	//쿠키 읽어오기(여러개)
	Cookie[] cookies = request.getCookies();
	
	//쿠키배열에서 특정쿠키의 키 : 값의 내용을 찾는다.
	String strName = "";
	String strValue = "";
	
	
	if(cookies != null) {
		for(int i = 0; i < cookies.length; i++){
			strName = cookies[i].getName();
		if(strName.equals("cookieName")){
			out.println("쿠키[" + i + "] name : " + strName + "<br />");
			strValue = cookies[i].getValue();	
			out.println("쿠키[" + i + "] value : " + strValue + "<br />");
			out.println("====================================<br />");
			}
		}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기는 클라이언트</title>
</head>
<body>
	<h1>여기는 클라이언트, 쿠키 읽어오기</h1>
	<a href="cookiedelete.jsp">쿠키 삭제</a>
</body>
</html>