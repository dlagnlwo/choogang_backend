<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form {
		border: 0px solid black;
		text-align: center;
		height: 800px;
	}
	input {
		margin-bottom: 10px;
		border-radius: 6px;
	}
	#login {
		width: 100px; height: 50px;
		cursor: pointer;
	}
	#login:hover {
		opacity: 0.7;
		transition: all 0.2s;
		font-color: black;
	}
	#input1 {
		height: 30px; width: 150px;
		font-size: 16px;
	}
	select {
		height: 30px; width: 150px;
		cursor: pointer;
	}
	
</style>
</head>
<body>
	<form action="Form" method="post">
		<!-- 이름 입력 -->
		<label for="name">이름 : </label>
		<input type="text" id="input1" name="name" size="10"/><br>
		
		<!-- 아이디 입력 -->
		<label for="id">아이디 : </label>
		<input type="text" id="input1" name="id" size="10"/><br>
		
		<!-- 패스워드 입력 -->
		<label for="password">패스워드 : </label>
		<input type="password" id="input1" name="password" size="20"/><br>
		
		<!-- 취미 입력 -->
		<%-- 배열로 넘어가야됨 --%>
		<label for="hobby">취미 : </label>
		<input type="checkbox" name="hobby" value="독서"/>독서
		<input type="checkbox" name="hobby" value="요리"/>요리
		<input type="checkbox" name="hobby" value="조깅"/>조깅
		<input type="checkbox" name="hobby" value="수영"/>수영
		<input type="checkbox" name="hobby" value="취침"/>취침
		<br>
		
		<%-- 라디오 버튼 --%>
		<!-- 
		<label for="radio">전공 : </label>
		<input type="radio" name="major" value="kor"/>국어
		<input type="radio" name="major" value="eng"/>영어
		<input type="radio" name="major" value="math"/>수학
		<input type="radio" name="major" value="design"/>디자인
		<br>
		 -->
		<%-- select박스 --%>
		<p><select name="major">
				<option> 전공선택 </option>
				<option value="국어"> 국어 </option>
				<option value="영어"> 영어 </option>
				<option value="수학"> 수학 </option>
				<option value="디자인"> 디자인 </option>
		</select>
		<br>
		<br>
		<!-- 결과버튼 -->
		<input type="submit" id="login" name="result" value="로그인"/>
	</form>
	
	
</body>
</html>