package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchName {
	
	static void method(String ename) {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp where ename = '"+ename+"'";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs == null)
				try {
					rs.close();
				}catch(Exception e) {
					
				}
			if (stmt != null)
				try {
					rs.close();
				}catch(Exception e) {
					
				}
			if (conn != null)
				try {
					rs.close();
				}catch(Exception e) {
					
				}
		}
	}
	
	public static void main(String[] args) {
		Class2 c2 = new Class2();
//		c2.method("JONES");
//		
//		method();
		
	}
}
