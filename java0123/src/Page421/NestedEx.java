package Page421;

import Page421.Car.engine;

public class NestedEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		Car.tire tire = car.new tire();
				
		engine engine = new Car.engine();

	}

}
