package page408_1;

public class Ex {
	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B(); //B객체를 만들기 위해서는 A객체를 먼저 만들어야한다.
		A.B b = new A().new B(); //위에두줄 합친거
		
		b.field1 = 3;
		b.method1();
	
	}
	
}
