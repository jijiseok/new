package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx {

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
		ResultSet rs = stmt.executeQuery("select * from dept");
		while (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s/n", deptno, dname, loc);
		}	
		conn.close();
	}
}
