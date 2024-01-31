package page436;

public class Anonymous {
	private int field;
	void method(int arg1, int arg2) {
		int var1 =0; //final 특성을 가지고있다
		int var2 =0;//final 특성을 가지고있다
		field = 10;
		Calculator calc = new Calculator() {

			@Override
			public int sum() {
				int result = field + arg1 +arg2 + var1 + var2;
				return result;
			}
		};
		
	}
	
	public static void main(String[]ar) {
		Anonymous anony= new Anonymous();
		anony.method(0, 0);
	}
	
}
