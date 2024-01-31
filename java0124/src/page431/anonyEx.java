package page431;

public class anonyEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.TurnOff();
		
		anony.method1();
		
		anony.method2(new RemotControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트TV 켜다");
			}
			
			@Override
			public void TurnOff() {
				System.out.println("스마트TV 끄다");
			}
		});

	}

}
