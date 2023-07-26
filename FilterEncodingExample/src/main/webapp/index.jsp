<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css" >

</head>
<body>
    <div class="encoding">
		<form action="encoding" method="post">
			이름 <input type="text" name="name"><br>
			나이 <input type="text" name="age"><br>
			장소 <input type="text" name="place"><br>
			<input type="submit">
		</form>
	</div>
	<hr />
	<script src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>