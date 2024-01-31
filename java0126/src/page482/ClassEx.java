package page482;

class Car{}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class clazz = Car.class;
		//리소스 절대 경로 얻기
		String str = clazz.getResource("photo2.jpg").getPath();
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		
		//메타 데이터를 쓰기위한 방법 1번 (클래스로 얻기)
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		
		
		//메타 데이터를 쓰기위한 방법 2번 (객체로얻기)
		Class clazz2 = Class.forName("page482.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());

		//메타 데이터를 쓰기위한 방법 3번 ()
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
	}

}
