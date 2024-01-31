package page446;

public class NFEex {

	public static void main(String[] args) {
		try {
		
		int x = Integer.parseInt("aa");
		System.out.println(x);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("숫자 변환 불가");
		}
	}

}
