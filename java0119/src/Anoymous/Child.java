package Anoymous;

class Parent {
	void method() {}
}
public class Child extends Parent{
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = (Child) parent;
		//이름이 있기떄문에 강제형변환가능
		
		
		new Child(); //익명 객체
		
		Parent parent1 = new Parent() { //자식객체생성하는것

			@Override
			void method() {
				// TODO Auto-generated method stub
				super.method();
			}
			
		};
	}

}
