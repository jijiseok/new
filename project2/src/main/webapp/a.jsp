<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String str = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=str %>

get방식으로 이동하는것<br>
<a href="b.jsp">b 페이지 이동</a><br>
<a href="https://www.naver.com">네이버</a>


</body>
</html>