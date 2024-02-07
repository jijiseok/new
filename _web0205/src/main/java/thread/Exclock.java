package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exclock {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());

		for (int i = 0; i < 5; i++) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTimeFormat1 = localDateTime
					.format(DateTimeFormatter.ofPattern("YYYY년 MM월 DD일 HH시 MM분 SS초"));
			System.out.println(localDateTimeFormat1);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("time out");
	}

}
