<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType = "text/html; charset=utf-8" %>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	boolean login = false;
	//mysql 접속 후 로그인 체크
	String sql ="SELECT count(*) from board where num = ? and writer = ?";
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try ( //자원 반납을 내가 안해도 돼는걸 쓰는거
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/project1", "root", "mysql");
		PreparedStatement pstmt = conn.prepareStatement(sql); //셀렉트문을 준비시킴
			
			) {
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery(); //executeQuery로 결과를 가져옴
		rs.next();
		int res = rs.getInt(1);
		if (rs.getInt(1) == 1){ //로그인 성공 조건
			login = true;
		}
		
	}catch (SQLException e){
		e.printStackTrace();
	}
	if (login) {
		session.setAttribute("MEMBERID", id);
		response.sendRedirect("list.jsp");
%>
<html>
<head><title>로그인성공</title></head>
<body>

로그인에 성공했습니다.

</body>
</html>
<%
	} else { // 로그인 실패시
%>
<script>
alert("로그인에 실패하였습니다.");
history.go(-1);
</script>
<%
	}
%>
