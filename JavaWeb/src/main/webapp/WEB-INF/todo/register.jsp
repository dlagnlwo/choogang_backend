<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/todo/register" method="post">
		<div>
			title : <input type="text" name="title" placeholder="내용을 입력해주세요"/>
		</div>
		<div>
			Date : <input type="date" name="dueDate" id="date" value="2023-06-23">
		</div>
		<div>
			<button type="reset">RESET</button>
			<button type="submit">등록</button>
		</div>
	</form>
</body>
</html>