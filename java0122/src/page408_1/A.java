package page408_1;

public class A {
	static int field3;
	class B { //내부용
		B(){} //생성자
		int field1; // 인스턴스 필드
//		static field2; //B객체생성없이 정적필드안됌
		void method1() {} 
//		static void method2() {}//B객체생성없이 정적메소드안됌 
	}
	void method() {
		B b = new B ();
		b.field1 = 3;
		b.method1();
	}
}
