package page463;

public class Pro1_3 {
	
	void method()  {
		System.out.println("method()");
	}
	void method2() {
		try {
			
			method();
			return; // return이 있어도 finally는 실행된다
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("method2()-finally");
		}
	}
	public static void main(String[] args) {
		Pro1_3 pr = new Pro1_3();
		pr.method2();
	}

}
