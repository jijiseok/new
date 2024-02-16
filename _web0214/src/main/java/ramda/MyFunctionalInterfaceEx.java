package ramda;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface f1, f2;
		
		
		f2 = new MyFunctionalInterface() {
			
			@Override
			public int method(int x, int y) {
				
				return sum(x,y);
			}
		};
		
		System.out.println(f2.method(100, 200));
		
		//위에거를 아래거(람다)처럼 만들수 있다.
		f1 = (x, y) -> {return sum(x,y);};
		System.out.println(f1.method(10, 20));
	}

	
	public static int sum(int x, int y) {
		return x+y;
	}
	
}
