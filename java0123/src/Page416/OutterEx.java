package Page416;


public class OutterEx {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		//import하지 않는 문장
//		Nested nested = outter.new Nested();
		//임포트 해야하는 문장
		nested.print();
		
	
	
	}

}
