package page427;

class Parent {
	void parentMethod() {}
}


public class A {
	Parent field = new Parent() {
		int childfield; //익명 자식 필드
		void childMethod() {} //익명 자식 메소드
	}; //필드 : Parent의 익명 자식 객체 생성
	
	
	void method(){
		field.parentMethod();
	}//메소드
		
}
