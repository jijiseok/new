package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	public Emp(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}

public class JdbcArrayQz {
	public static void main(String[]args) {
		List<Emp> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id ="root";
		String pass ="mysql";
		Statement stmt = null;
		Connection conn = null;
		
		String sql = "select empno, ename, job,sal from emp";//"select * from emp";
					
		try {
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement(); 
			ResultSet rs =  stmt.executeQuery(sql);
			while (rs.next()) {		
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				Emp dept = new Emp(empno, ename,job ,sal );
				list.add(dept);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		for(Emp emp : list){
			System.out.println(emp.getEmpno()+"\t"+ emp.getEname()+"\t"+emp.getJob()+"\t"+emp.getSal()); 
			
		}
	}
}