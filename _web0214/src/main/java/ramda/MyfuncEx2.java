package ramda;

public class MyfuncEx2 {

	public static void main(String[] args) {
		Myfunc2 mf = ()-> { System.out.println("람다");};
		
	mf.aaa();
	
	Myfunc2 mf1 = new Myfunc2() {

		@Override
		public void aaa() {
			System.out.println("람다");
			
		}
		
	};
	mf1.aaa();
	}
}
