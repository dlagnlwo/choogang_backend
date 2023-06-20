<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewCalc.jsp</title>
<style>
	form {
		position: relative;
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		height: 500px;
		border: 0px solid black;
		text-align: center;
	}
	#input1 {
		display: inline-block;
		height: 40px;
		padding: 0 10px;
		vertical-align: middle;
		border: 1px solid #dddddd;
		width: 60%;
		color: black;
		border-radius: 5px;
	}
	#btn {
		width: 100px; height: 50px;
		background-color: rgba(0, 53, 109, 0.95);
		color: #fff;
		cursor: pointer;
		border-radius: 5px;
		font-size: 16px;
		margin-left: 10px;
	}
	#btn:hover {
		opacity: 0.9;
		transition: all 0.2s;
		color: red;
	}
</style>
</head>
<body>
	<form action="/calc/Operator" method="post">
		<input type="number" id="input1" name="num1" placeholder="숫자1"/>
		<br />
		<input type="number" id="input1" name="num2" placeholder="숫자2"/>
		<br />
		<input type="text" id="input1" name="oper" placeholder="연산자"/>
		<br />
		<br />
		<button type="submit" id="btn"> 결과 </button>
	</form>
</body>
</html>