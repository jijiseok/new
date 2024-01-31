package chap08.exam03;

class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
	
}
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
	
}
public class SoundableEx { //파일하나에 public은 하나
	
	public static void printSound(Soundable soundable) {}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
