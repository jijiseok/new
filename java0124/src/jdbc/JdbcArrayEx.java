package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


class Dept{
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}

public class JdbcArrayEx {
	public static void main(String[]args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm";
		String id ="root";
		String pass ="mysql";
		Statement stmt = null;
		Connection conn = null;
		
		String sql = "select deptno, dname, loc from dept";//"select * from dept";
					
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement(); 
			ResultSet rs =  stmt.executeQuery(sql);
			while (rs.next()) {		
//				int deptno = rs.getInt(1); //(1)첫번쨰컬럼, 아래랑 같은코드 정확한 순서를 모르면 안쓰는게 좋
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				String str = deptno +", "+dname+", " + loc;
//				System.out.println(deptno +", "+dname+", " +loc);
				Dept dept = new Dept(deptno, dname,loc);
				list.add(dept);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		System.out.println(list);
		
		for (Dept dept : list) {
			System.out.println(dept);
		//list에 있는 자료를 모두 출력하세요.(향상된 반복문)
		for(Dept s : list){
			System.out.println(dept.getDeptno()+"\t"
                    +dept.getDname()+"\t"
                    +dept.getLoc()); 
		}			
		}
	}
}