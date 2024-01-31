package Page420;

public class A {
	
	void method(int x) {
		String y = "yyy";
//		y="AAA";
//		x=100;
		class Inner {
			void method() {
				String z = x + y;
			}
		}
	}
	int x =10;
	
	static class B{
		void method() {
//			System.out.println(x);
		}
	}

}
