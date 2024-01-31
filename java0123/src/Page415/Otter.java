package Page415;

public class Otter {

	public void method2(final int arg) {
		final int localVar = 1;
//		arg = 100;
//		localVar = 100;
		//내부클래스가 있는경우 지역변수들은 final처리한다 스레드에 살아있을수있기 때문에
		class Inner{
			public void method() {
				int result = arg +localVar;
			}
		}
		
	}
}
