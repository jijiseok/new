package sec02.exam03;

public class DaoEx {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insult();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
