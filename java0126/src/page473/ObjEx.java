package page473;

public class ObjEx {

	public static void main(String[] args) {
		String str = new String ("가나다");
		String str2 = new String ("가나다");
		System.out.println(str.equals(str2));
		
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		
		boolean result2 = (obj1 == obj2);
		System.out.println(result2);
		
	}

}
