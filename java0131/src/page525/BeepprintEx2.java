package page525;

public class BeepprintEx2 {

	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start(); //run이 아니라 start로 해야됌
		
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);//잠시 0.5초 멈춤
			} catch (InterruptedException e) {
				
				
			} 
		}
		System.out.println("BeepTask 종료");
	}

}
