package thread;

public class IntterruptE3 {

	public static void main(String[] args) {
		PrintThread3 printThread3 = new PrintThread3();
		printThread3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		printThread3.interrupt();
	}

}
