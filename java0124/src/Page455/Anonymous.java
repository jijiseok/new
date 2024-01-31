package Page455;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시기상");
			work();
		}
		
	};
	
	void method() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}

			@Override
			void wake() {
				System.out.println("7시 기상");
				walk();
			}
		
		};
		localVar.wake();
	}
	
	
	void method2 (Person person) {
		person.wake();
	}
	
}
