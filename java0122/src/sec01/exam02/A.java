package sec01.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
//	static B field3 = new B(); A객체가 생성되어야 가능
	static B field3 = new A().new B();
	static C field4 = new C();
	
	void method1() {
//		B var1 = new B ();
		C var2 = new C ();
		B var1 = new A().new B();
	}
	
	static void method2() {
//		B var1 = new B(); 안됌
		C var2 = new C();
	}
	
	class B {}
	static class C {}
	
}
