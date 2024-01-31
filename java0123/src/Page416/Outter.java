package Page416;

public class Outter {
	static String str = "static-str" ;
	String field ="Outter-field";
	void method() {
		System.out.println("outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		
		void method() {
			System.out.println("Nested-field");
		}
		void print() {
			System.out.println(Outter.str);
			System.out.println(this.field); //중첩객체참조
			System.out.println(Outter.this.field);//바깥객체참조
		}
	}
	
}
