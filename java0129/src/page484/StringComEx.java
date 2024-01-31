package page484;

public class StringComEx {

	public static void main(String[] args) {
		String str1 = "aBc";
		String str2 = "Abc";
		
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("같다");
		}
		
	}
	
}
