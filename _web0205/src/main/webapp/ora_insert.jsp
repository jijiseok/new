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
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
        	"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
    ) {
        
        String[][] score2 = { //초기값을 넣어주기 insert문장으로 넣어도됌
            { "1", "홍길동", "50", "60", "70" }, 
            { "2", "이순신", "65", "75", "85" }, 
            { "3", "강감찬", "60", "80", "70" }
        };
        
        for (int i = 0; i < score2.length; i++) {
            String sql = String.format(
                    "insert into score2 values (%s, '%s', %s, %s, %s)",
                    score2[i][0], score2[i][1], score2[i][2], 
                    score2[i][3], score2[i][4]);
            
            stmt.executeUpdate(sql);
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>