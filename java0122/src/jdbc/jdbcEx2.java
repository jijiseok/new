package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company";
		String id ="root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver"); //jdbc가있는지 확인
		System.out.println("mysql 드라이버 로딩");
		Connection conn 
				= DriverManager.getConnection(url, id, pass);
		System.out.println("mysql 접속성공");
		
		Statement stmt = conn.createStatement(); //쿼리문을 텍스트로 만들어서 DB로 날려줌
		ResultSet rs = stmt.executeQuery("select * from emp"); //뜻(select all From emp)
		while (rs.next()) { //next()로 한줄씩읽기
			String ename = rs.getString("ename");
			double sal = rs.getDouble("sal");
			
			System.out.printf("%s, %f\n",ename,sal);
		}	
		conn.close();

	}

}
