package ramda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf2, mf3;
		
		mf3 = a -> System.out.println("method");
		mf3.method(10);
		
		mf = new MyFunc() {
			
			@Override
			public void method(int x) {
				System.out.println(x);
				
			}
		};
		mf.method(10);
		
		//위에있는걸 간략하게 쓰기위해 만들어짐
		mf2 = (a) -> {System.out.println("method");};
		mf2.method(10);
	}

}
