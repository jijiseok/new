package sec02.exam03;

public class MysqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MysqlDao select");
		
	}

	@Override
	public void insult() {
		System.out.println("MysqlDao insult");
		
	}

	@Override
	public void update() {
		System.out.println("MysqlDao update");
		
	}

	@Override
	public void delete() {
		System.out.println("MysqlDao delete");
		
	}

}
