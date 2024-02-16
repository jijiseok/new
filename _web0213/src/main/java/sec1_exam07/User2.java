package sec1_exam07;

public class User2 extends Thread{
	private Calculator calculator;


	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}


	@Override
	public void run() {
		calculator.setMemoty(50);
	}

	
	

}
