package page484;

import java.io.UnsupportedEncodingException;

public class StringGatByteEx {

	public static void main(String[] args) {
		String str = "안녕하세요";
		String nstr =str.replace("abc","감사합니다.");
		System.out.println(nstr);
		
		System.out.println(str.length());
		int index = str.indexOf("세요");
		System.out.println(index);
		index = "안녕하세요abc".indexOf("세요");
		System.out.println(index);
		
		
		
		byte[]bytes1 = str.getBytes();
		System.out.println("bytes1.length:" + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->Stirng" + str1);
		
		
			byte[] bytes2;
			try {
				bytes2 = str.getBytes("EUC-KR");
				System.out.println("bytes2.length:" + bytes1.length);
				String str2 = new String(bytes2, "EUC-KR");
				System.out.println("bytes2->Stirng" + str2);
			
				byte[]bytes3 = str.getBytes("UTE-8");
				System.out.println("bytes3.length:" + bytes1.length);
				String str3 = new String(bytes3, "UTE-8");
				System.out.println("bytes3->Stirng" + str3);
			
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		

	}

}
