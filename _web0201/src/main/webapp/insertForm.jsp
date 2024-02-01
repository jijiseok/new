<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">목록으로</a>
<form action="insert.jsp" method ="post">
	이름 <input type="text" name="name"><br/>
	직급 <input type="text" name="job"><br/>
	연봉 <input type="text" name="sal"><br/>
	<input type="submit" value="확인"/>
	<input type="reset" />
</form>
</body>
</html>