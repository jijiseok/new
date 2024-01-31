package chap08.pro03;

import java.util.ArrayList;
import java.util.List;
class MyClass{}
interface Inter{}
class Acc{
	Inter inter;
	MyClass mc = new MyClass();
	int x;
	String str;
	String getstr() {
		return str;
	}
}

public class VehicleExample {

	public static void main(String[] args) {
		new Bus().checkFare();  
		//강제형변환없이 실행가능하긴함 변수선언이 없어서 일회용으로가능
		
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		Vehicle.chckFare() 이게안돼서 아래 강제 형변환
		if (vehicle instanceof Bus) {
			System.out.println("가능");
		}
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		String str = "테스트";
		String str1 = "";
		for (int i=0; i <100; i++) { //성능 고민 필요
			str1 += str;
		}
		System.out.println(str1);
		
		
		List<Acc> list = new ArrayList<>();
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc());
		
		for(Object obj : list) {
			Acc acc = (Acc) obj;
			System.out.println(acc);
		}
		
		Vehicle vehicle1 = new Bus();
	}
}
