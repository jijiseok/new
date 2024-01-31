package page460;

class Anyclass{
	void anyMethod() throws Exception{}
	void method() throws Exception {
		this.anyMethod();
	}
}

public class Ex {

	public static void main(String[] args) throws Exception  {
		Anyclass ac = new Anyclass();
		ac.method();
		
	}

}
