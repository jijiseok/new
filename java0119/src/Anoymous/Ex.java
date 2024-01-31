package Anoymous;

class AnyClass {
	void mmm( ) {};
}

public class Ex {

	public static void main(String[] args) {
		
		AnyClass ac = new AnyClass() {
			//익명의 자식객체임 이름이 없어서 강제형변환으로 돌아가는걸 못함
			
			@Override
			void mmm() { //재정의가 된다는 이야기는 자식이라는 말, 
				
				super.mmm();
			} 
			
		};

	}

}
