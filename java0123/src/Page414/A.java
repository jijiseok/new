package Page414;

public class A {
	public static void main(String[]ar) {
		B b = new B();
		b.method();

		A a = new A();
//		B b = a.new B();
//		B b = new A().new B();
//		b.method();
	}
	
	int field;
	void method1 () {
		System.out.println("method1()");
	}
	
	static class B { //static이 붙으면 A와 별개로 자체생성가능
		void method() {
//			field = 10;
//			method();
			System.out.println("method(),");
		}
	}
}
