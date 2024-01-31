package page525;


//다시 올리기
public class BeepTask implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);//잠시 0.5초 멈춤
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
		}
		
	}

	

}
