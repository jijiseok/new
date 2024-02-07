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
String sql = "insert into score(num,name,kor,eng,math) values(?,?,?,?,?)"; //oracle에 입력할 문자열 
PreparedStatement pstmt = conn.prepareStatement(sql); //문자열에 들어갈것들을 준비한다
pstmt.setString(1, request.getParameter("num")); //""안에는 form에 있는거와 같아야한다
pstmt.setString(2, request.getParameter("name")); 
pstmt.setString(3, request.getParameter("kor"));
pstmt.setString(4, request.getParameter("eng"));
pstmt.setString(5, request.getParameter("math"));

int res = pstmt.executeUpdate(); //res는 성공한 갯수 조건물을 안쓸거면 안써도됀다
response.sendRedirect("index.jsp");

%>
</body>
</html>