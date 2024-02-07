package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;

public class clock2 implements Runnable{
		JFrame jf;
		
		clock2 (JFrame jf){
			this.jf = jf;
		}

		@Override
		public void run() {
			for (;;) {
				LocalDateTime localDateTime = LocalDateTime.now();
				String localDateTimeFormat1 = localDateTime
						.format(DateTimeFormatter.ofPattern("YYYY년 MM월 DD일 HH시 MM분 SS초"));
				System.out.println(localDateTimeFormat1);
//				WinEmp.this.setTitle(localDateTimeFormat1);
				jf.setTitle(localDateTimeFormat1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
}
