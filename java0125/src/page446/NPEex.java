package page446;

class MyClass {
	void method() {
		
	}
}

public class NPEex {

	public static void main(String[] args) {
		MyClass mc = null; //변수는 있지만 객체가 생성되지 않았기떄문에 오류
		System.out.println(mc);
		mc.method(); //메서드를 호출하지 않으면 오류가 나지않음 ?
		
		
		String data = null; 
		System.out.println(data.toString());
		
	}

}
