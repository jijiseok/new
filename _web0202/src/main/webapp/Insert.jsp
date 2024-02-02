<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%  
	request.setCharacterEncoding("utf-8");
	String driver="oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	String sql="insert into score(NUM,NAME,KOR,ENG,MATH) values (?,?,?,?,?)";
	
	
    try ( 
        Connection conn = DriverManager.getConnection(url,"scott","tiger");
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {
    	pstmt.setInt(1, Integer.parseInt(request.getParameter("NUM")));
        pstmt.setString(2, request.getParameter("NAME"));
        pstmt.setInt(3, Integer.parseInt(request.getParameter("KOR")));
        pstmt.setInt(4, Integer.parseInt(request.getParameter("ENG")));
        pstmt.setInt(5, Integer.parseInt(request.getParameter("MATH")));
        int result = pstmt.executeUpdate();
        if(result==1){
        	out.println("입력성공!");
        }
    	
    	
    } catch(Exception e) {
        e.printStackTrace();
    }
    response.sendRedirect("list.jsp");
%>
</body>
</html>