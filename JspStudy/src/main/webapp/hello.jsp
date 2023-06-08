<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello JSP</title>
	<style>
		body {
			position: relative;
		}
		form {
			width: 300px; height: 200px;
			border : 0px solid black;
			position: absolute; top: 400px; left: 800px;
		}
		.login {
			position: absolute; top: 70px; left: 100px;
			margin-top: 30px;
			width: 100px; height: 50px;
			line-height: 50px;
		}
		.id {
			height: 30px;
		}
		.password {
			height: 30px;
		}
	</style>
</head>
<body>
	<form action="index.jsp" method="post">
		
		<label>아이디: </label>
		<input type="text" name="id" placeholder="황진이" class="id"/>
		<br/>
		<br/>
		<label>비밀번호: </label>
		<input type="password" name="password" placeholder="****" class="password" />
		<br/>
		<input type="submit" value="로그인" class="login" />
	</form>
	
	
</body>
</html>