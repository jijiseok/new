package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id ="root";
		String pass ="mysql";
		Class .forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql = "update emp set sal = 3000 where empno = 7777"; //행업데이트하기
		int result = stmt.executeUpdate(sql); //insert delete update할때 씀
		if(result >= 1 ) {
			System.out.println("수정성공" + result);
		}else {
			System.out.println("수정실패"+ result);
		}
	}
}
