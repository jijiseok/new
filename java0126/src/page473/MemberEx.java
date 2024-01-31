package page473;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("Blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2가 같습니다");
		}
		else {System.out.println("obj1과 obj2가 같지않습니다");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj2가 같습니다");
		}
		else {System.out.println("obj1과 obj2가 같지않습니다");
		}
	
	}


}


