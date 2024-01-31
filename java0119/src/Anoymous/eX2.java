package Anoymous;

interface Inter {// 인터페이스는구현객체가필요하다
	void disp();
}

public class eX2 {

	public static void main(String[] args) {
		Inter it = new Inter () {
			int y = 100;
			public void disp2() {
				System.out.println("disp2");
			}
			@Override
			public void disp() { //재정의한것은 부를수있다
				System.out.println(y);
				disp2();
			}
			
		};
		it.disp();
		
	}

}
