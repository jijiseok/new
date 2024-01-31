
public class d {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		;
		System.out.print("empno:");
		int empno2 = Integer.parseInt(scan.nextLine());
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

		String sql = " update emp set empno =" + empno2 + "ename = "+ ename + "job =" + job + "mgr = " + mgr + "hiredate =" +hiredate + "sal=" +sal + "comm=" + comm + "deptno" +deptno+ "where empno ="+empno ;
		

}
