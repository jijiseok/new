<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">뒤로가기</a>
<form action="Insert.jsp" method ="post">
	NUM  <input type="text" name="NUM" ><br/>
	NAME <input type="text" name="NAME"><br/>
	KOR  <input type="text" name="KOR"><br/>
	
	ENG  <input type="text" name="ENG"><br/>
	MATH <input type="text" name="MATH"><br/>
	<input type="submit" value="확인"/>
	<input type="reset" />
</form>
</body>
</html>