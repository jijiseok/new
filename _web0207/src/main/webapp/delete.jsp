<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
request.setCharacterEncoding("utf-8"); //한글이 꺠질까봐
String driver = "oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
Connection conn = DriverManager.getConnection(url,"scott", "tiger");
String sql = "delete from score where num = ?"; //oracle에 입력할 문자열 
PreparedStatement pstmt = conn.prepareStatement(sql); //문자열에 들어갈것들을 준비한다
pstmt.setString(1, request.getParameter("num")); //""안에는 form에 있는거와 같아야한다

int res = pstmt.executeUpdate(); //res는 성공한 갯수 조건물을 안쓸거면 안써도됀다
response.sendRedirect("index.jsp");

%>
</body>
</html>