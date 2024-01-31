package page499;
				
public class BoxingEx {
	
	public static void main(String[] args) {
		
		int x = 100;
		String str = "가나다";
		
		//박싱
		Integer obj7 = new Integer(100);
		Integer obj8 = new Integer("200");
		Integer obj9 = Integer.valueOf("300");
		Integer obj1 = 100;
		System.out.println(obj1);
		
		//언방식
		int y = obj1.intValue();
		System.out.println(y);
		
		int z = x + obj1;
		System.out.println(z);
		
		
		Integer num1 = new Integer(3);
		Integer num2 = new Integer(3);
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num1));
	}

}
