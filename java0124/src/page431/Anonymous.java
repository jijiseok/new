package page431;

public class Anonymous {
	RemotControl field = new RemotControl() {//인터페이스는 객체생성불가능
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켜다");
		}
		
		@Override
		public void TurnOff() {
			System.out.println("TV를 끄다");
		}
	};
	
	void method1() {
		RemotControl localVar = new RemotControl() { //로컬변수는 초기화를 해줘야한다.
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켜다");
				
			}
			
			@Override
			public void TurnOff() {
				System.out.println("Audio를 끄다");
				
			}
		};
		
		localVar.turnOn();
		
	}
	
	void method2(RemotControl rc) {
		rc.turnOn();
	}
}
