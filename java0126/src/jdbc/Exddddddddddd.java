package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp {
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;

	public Emp(int empno, String ename, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
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

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}

public class Exddddddddddd {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scan = new Scanner(System.in);
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 데이터 수정");
				System.out.println("4. 데이터 삭제");
				System.out.println("5. 종료");
				System.out.print("선택하세요: ");

				String choice = scan.nextLine();

				switch (choice) {
				case "1":
					viewData(connection);
					break;
				case "2":
					insertData(connection);
					break;
				case "3":
					update(connection);
					break;
				case "4":
					delete(connection);
					break;
				case "5":
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewData(Connection connection) {

		List<Emp> list = new ArrayList<>();
		String sql = "select * from emp";
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");

				Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (Emp emp : list) {
			System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob() + "\t" + emp.getMgr() + "\t"
					+ emp.getHiredate() + "\t" + emp.getSal() + "\t" + emp.getComm() + "\t" + emp.getDeptno());
		}

	}

	private static void insertData(Connection connection) {

		System.out.print("empno:");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.print("ename:");
		String ename = scan.nextLine();
		System.out.print("job:");
		String job = scan.nextLine();
		System.out.print("mgr:");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.print("hiredate YYYY-MM-DD:");
		String hiredate = scan.nextLine();
		System.out.print("sal:");
		int sal = Integer.parseInt(scan.nextLine());
		System.out.print("comm:");
		int comm = Integer.parseInt(scan.nextLine());
		System.out.print("deptno:");
		String deptno = scan.nextLine();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			String sql = "insert into Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values  ('" + empno
					+ "', '" + ename + "', '" + job + "', '" + mgr + "', '" + hiredate + "', '" + sal + "', '" + comm
					+ "', '" + deptno + "')";
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("입력성공");
			} else {
				System.out.println("입력실패");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private static void update(Connection connection) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();

			System.out.print("수정할 사원의 사번을 입력하세요: ");
			String empno = scan.nextLine();
			String sq2 = "select * from emp where empno = '" + empno + "'";
			ResultSet rs2 = stmt.executeQuery(sq2);
			while (rs2.next()) {
				System.out.print(rs2.getInt("empno") + ",\t");
				System.out.print(rs2.getString("ename") + ",\t");
				System.out.print(rs2.getString("job") + ",\t");
				System.out.print(rs2.getInt("mgr") + ",\t");
				System.out.print(rs2.getString("hiredate") + ",\t");
				System.out.print(rs2.getDouble("sal") + ",\t");
				System.out.print(rs2.getDouble("comm") + ",\t");
				System.out.println(rs2.getInt("deptno") + ",\t");
			}
			

			ResultSet rs = stmt.executeQuery(sq2);
			System.out.print("수정할 내용을 입력하세요: ");
			String sql = scan.nextLine(); // 행업데이트하기
			int result = stmt.executeUpdate(sql); // insert delete update할때 씀
			if (result >= 1) {
				System.out.println("수정성공" + result);
			} else {
				System.out.println("수정실패" + result);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	private static void delete(Connection connection) {

		// 행삭제하기
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("삭제할 사원의 사번을 입력하세요: ");
			String empno = scan.nextLine();
			String sq2 = "select * from emp where empno = '" + empno + "'";
			ResultSet rs2 = stmt.executeQuery(sq2);
			
			while (rs2.next()) {
				System.out.println("삭제할 사원의 정보를 확인해주세요");
				System.out.print(rs2.getInt("empno") + ",\t");
				System.out.print(rs2.getString("ename") + ",\t");
				System.out.print(rs2.getString("job") + ",\t");
				System.out.print(rs2.getInt("mgr") + ",\t");
				System.out.print(rs2.getString("hiredate") + ",\t");
				System.out.print(rs2.getDouble("sal") + ",\t");
				System.out.print(rs2.getDouble("comm") + ",\t");
				System.out.println(rs2.getInt("deptno") + ",\t");
			}

			System.out.println("----------------------");
			System.out.println("1. 삭제 | 2.메뉴로 돌아가기");
			System.out.println("----------------------");
			String deletno = scan.nextLine();
			if (deletno.equals("1")) {
				String sql = "delete from emp where empno = " + deletno;
				int result = stmt.executeUpdate(sql);
				if (result >= 1) {
					System.out.println("삭제성공" + result);
				} else {
					System.out.println("삭제실패" + result);
				}
			}

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
