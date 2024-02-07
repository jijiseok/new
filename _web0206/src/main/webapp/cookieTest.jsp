<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie ck = new Cookie("login", "admin");
ck.setMaxAge(60); //쿠키를 유지하는 시간 60초
response.addCookie(ck);
%>
<%= ck.getName() %><br/>
<%= ck.getValue() %>
</body>
</html>