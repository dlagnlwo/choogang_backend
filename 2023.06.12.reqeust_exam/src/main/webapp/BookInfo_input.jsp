<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		position: relative;
	}
	form {
		position: absolute; top: 300px; left: 650px;
		border: 0px solid black;
		width: 500px; height: 300px;
		text-align: center;
		line-height: 60px;
	}
	#in {
		border-radius: 5px;
		height: 30px;
	}
	#result {
		width: 100px; height: 40px;
	}
	
</style>
</head>
<body>
	<form action="bookInfo_process.jsp" method="get">
		제목: <input type="text" id="in" name="book_title" value="" placeholder="제목"/><br />
		출판사: <input type="text" id="in" name="book_publisher" value="" placeholder="출판사"/><br />
		가격: <input type="text" id="in" name="book_price" value="" placeholder="가격"/><br />
		<input type="submit" id="result" value="보내기"/>
	</form>
</body>
</html>