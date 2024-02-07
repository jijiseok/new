<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
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
String url="jdbc:oracle:thin:@localhost:1521:xe"; 
Connection conn = DriverManager.getConnection(url,"scott", "tiger");
String sql = "select * from score2 where num = ?";
PreparedStatement pstmt = conn.prepareStatement(sql); 
pstmt.setString(1, request.getParameter("num"));
ResultSet rs = pstmt.executeQuery();
String num = ""; //지역변수이기 떄문에 초기화를 해줘야한다 
String name = "";
String kor =  "";
String eng =  "";
String math =  "";

if(rs.next()){ // 무조건 1건(행)이기 때문에 if문을 쓴다
	num = rs.getString("num");
	name = rs.getString("name");
	kor = rs.getString("kor");
	eng = rs.getString("eng");
	math = rs.getString("math");
} 
%>
<a href="index.jsp">뒤로가기</a>
<form action="ora_update.jsp" method ="post">
	NUM  <input type="text" name="num" value="<%=num%>"><br/>
	NAME <input type="text" name="name" value="<%=name%>"><br/>
	KOR  <input type="text" name="kor" value="<%=kor%>"><br/>
	ENG  <input type="text" name="eng" value="<%=eng%>"><br/>
	MATH <input type="text" name="math" value="<%=math%>"><br/>
<button>수정</button>
</form>
<button onclick="location.href=ora_delete.jsp?num=<%=num%>'">삭제</button>
</body>
</html>