package page484;

public class ByteToString {

	public static void main(String[] args) {
		String sub ="자바 프로그래밍";
		System.out.println(sub.charAt(3));
		
		
		
		String str = new String ("가나다");
		
		byte[]bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1= new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		char[] chars = {'H','e','l','l','o'};
		str = new String (chars);
		System.out.println(str);
	}
	
}
