package sec06.exam04;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int num1 = cal.plus(100,200);
		System.out.println(num1);
		
		double num2 = cal.plus(3.14, 0.59);
		System.out.println(num2);

	}

}
