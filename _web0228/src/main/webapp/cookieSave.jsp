<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
//쿠키 저장하기

String email = request.getParameter("email");
String ck = request.getParameter("ck");

if (ck != null && ck.equals("on")){ //쿠키생성
	//System.out.println(email); 콘솔창에 이메일 뜨게하기
	
	Cookie cookie = new Cookie("email", email); //쿠키를 email이름으로 저장한다
	cookie.setMaxAge(60); //쿠키에 시간주기 (초단위)
	response.addCookie(cookie);
} else { //쿠키삭제
	Cookie cookie = new Cookie("email", null); 
	cookie.setMaxAge(0); 
	response.addCookie(cookie);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>