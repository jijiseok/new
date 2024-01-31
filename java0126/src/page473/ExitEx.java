package page473;

public class ExitEx {
	public static void main (String[]args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0);//jvm을 종료한다 
//				break; //11라인을 실행하고 싶으면 exit말고 break로 해야한다
			}
		}
	System.out.println("마무리코드");
	}
}
