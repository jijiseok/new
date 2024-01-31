package page460;

class Anyclass3{
	void anyMethod() {
		throw new NullPointerException();
	}
}

public class Ex3 {

	public static void main(String[] args) {
		Anyclass3 ac = new Anyclass3();
		ac.anyMethod();
		
	}

}
