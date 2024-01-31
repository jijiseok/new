package page525;

public class BeepprintEx {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);//잠시 0.5초 멈춤
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
		}

	
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);//잠시 0.5초 멈춤
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
		}
	}

}
