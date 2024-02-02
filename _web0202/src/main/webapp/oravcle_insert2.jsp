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
	String driver="oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:xe";
	String sql= "insert into score values (?,?,?,?,?)";
    try ( 
        Connection conn = DriverManager.getConnection(url,"scott","tiger");
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {
        
        String[][] score = { //초기값을 넣어주기 insert문장으로 넣어도됌
            { "1", "홍길동", "50", "60", "70" }, 
            { "2", "이순신", "65", "75", "85" }, 
            { "3", "강감찬", "60", "80", "70" }
        };
        
        for (int i = 0; i < score.length; i++) {
        	pstmt.setString(1,score[i][0]);
        	pstmt.setString(2,score[i][1]);
        	pstmt.setString(3,score[i][2]);
        	pstmt.setString(4,score[i][3]);
        	pstmt.setString(5,score[i][4]);
        	
            
        	pstmt.executeUpdate();
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>