package sec1_exam07;

public class Calculator {
	private int memory;

	public int getMemoty() {
		return memory;
	}

	public synchronized void setMemoty(int memoty) {
		this.memory = memoty;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
