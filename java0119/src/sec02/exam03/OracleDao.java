package sec02.exam03;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 select");
		
	}

	@Override
	public void insult() {
		System.out.println("오라클 insult");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 update");
		
	}

	@Override
	public void delete() {
		System.out.println("오라클 delete");
		
	}
	
}
