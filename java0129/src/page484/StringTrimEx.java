package page484;

public class StringTrimEx {

	public static void main(String[] args) {
		String str = "        가나  다        ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		String ss = 2+"";
		String str1 = String.valueOf(10.5);
		System.out.println(str1+30);
	}

}
