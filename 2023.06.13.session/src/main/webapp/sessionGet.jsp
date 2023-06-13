<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	Object obj1 = session.getAttribute("sessionName");//업캐스팅
	String sessionName = (String)obj1; //다운캐스팅
	out.println(sessionName + "<br />");

	Object obj2 = session.getAttribute("asd");
	Integer asd = (Integer)obj2;
	out.println(asd + "<br />");
	out.println("********************************" + "<br />");
	
	Object objFruitName1 = session.getAttribute("fruit1");
	String fruit1 = (String)objFruitName1;
	Object objFruitName2 = session.getAttribute("fruit2");
	String fruit2 = (String)objFruitName2;
	Object objFruitName3 = session.getAttribute("fruit3");
	String fruit3 = (String)objFruitName3;
	
	out.println("첫번째 과일: " + fruit1 + "<br />" +
				"두번째 과일: " + fruit2 + "<br />" +
				"세번째 과일: " + fruit3 + "<br />");
	out.println("********************************" + "<br />");
	
	Object objElec1 = session.getAttribute("UHDTV");
	Double elec1 = (Double)objElec1;
	Object objElec2 = session.getAttribute("세탁기");
	Double elec2 = (Double)objElec2;
	out.println("UHDTV 가격: " + elec1 + "<br />" + 
				"세탁기 가격: " + elec2 + "<br />");
	out.println("********************************" + "<br />");
	
	//Enumeration (열거형클래스)를 사용하여 Session의 모든 요소 반복문으로 접근
	String sName; //세션요소의 키이름
	String sValue; //세션요소의 키값
	
	//세션의 모든키이름 가져오기 : session.getAttributeNames();
	Enumeration e = session.getAttributeNames();
	//hasMoreElements() : 남아있는 자료가 있는지 없는지
	//있으면 nextElement(), 없으면 false
	//nextElement() : 다음 요소를 하나 가져옴
	while(e.hasMoreElements()){
		// e는 세션요소의 키이름의 모음 그중 세션키이름 하나를 가져옴
		sName = e.nextElement().toString();
		// 세션객체에서 키이름을 이용해 실제 키값을 가져옴
		// (String)으로 형변환 해도 되고 뒤에 .toString()메소드를 사용해도 됨
		sValue = session.getAttribute(sName).toString();
		out.println("키이름 : " + sName + "<br />" + 
					"키값 : " + sValue + "<br />");
	}
	out.println("##################################### <br />");
	
	//세션 정보 얻기
	//세션이 처음 만들어 지면 자동으로 생기는 유일한 코드키
	String sessionID = session.getId();
	out.println("SessionID : " + sessionID + "<br />");
	//세션 만료기간
	//단위 = 초
	int sessionInterval = session.getMaxInactiveInterval();
	out.println("세션만료기간: " + sessionInterval + "<br />");
	out.println("##################################### <br />");
	
	//세션 요소 삭제
	//세션요소 삭제 메소드: session.removeAttribute("삭제할 키 이름");
	//세션 키 이름이 sessionName 인 것을 삭제
	session.removeAttribute("sessionName");
	//세션 키 이름이 asd 인 것을 삭제
	session.removeAttribute("asd");
	//삭제된 요소 확인
	Enumeration enums = session.getAttributeNames();
	while(enums.hasMoreElements()){
		sName = enums.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("키이름: " + sName + "<br />" + 
					"키값: " + sValue + "<br />");
	}
	out.println("##################################### <br />");
	
	//세션 무효화(세션 모두 제거) = 반드시 로그아웃
	session.invalidate();
	
	//세션에 값이 있다면
	if(request.isRequestedSessionIdValid()) {
		out.println("현재 세션이 살아있음.");
	}else {
		//세션이 무효화된 경우 = 새로 로그인
		out.println("현재 세션이 초기화되었음.");
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a {
		text-decoration: none;
		color: black;
		text-align: center;
	}
	a:hover {
		color: red;
		opacity: 0.9;
		transition: all 0.2s;
	}
</style>
</head>
<body>
	<h1> >> <a href="sessionTest.jsp">Enumeration테스트</a> << </h1>
</body>
</html>