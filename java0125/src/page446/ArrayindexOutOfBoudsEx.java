package page446;

public class ArrayindexOutOfBoudsEx {

	public static void main(String[] args) {
		try {
			String str = args[0];
			String str1 = args[1];
			
			System.out.println(str);
			System.out.println(str1);
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); 오류나타나게 하는거
			System.out.println(e.getMessage());//무슨오류인지 나옴
			System.out.println("예외 발생");
		}
	}
}
