package thread;

public class task implements Runnable{

	@Override
	public void run() {
		System.out.println("task 시작");
		for(int i=0; i<5; i++) {
			System.out.println("task 진행");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("task 끝");
	} 
	

}
