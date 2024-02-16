package thread;

public class PrintThread extends Thread {

	private boolean Stop; //false 상태
	
	public void setStop(boolean stop) {
		Stop = stop;
	}

	@Override
	public void run() {
		while (!Stop) { //무한반복 
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
}
