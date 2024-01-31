package Page455;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {
	public static void main(String[]args) {
		String str;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) { //e는 변수 아무거나써도됌
			//에외처리코드
			System.out.println("클래스가 존재하지 않음");
			System.exit(0);
		}	finally {
				System.out.println("반드시 실행");
		}
		
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
