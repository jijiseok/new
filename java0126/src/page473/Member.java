package page473;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "member [" + id + "]";
	}



	@Override
	public boolean equals(Object obj) {//매개변수 다형성
		if(obj instanceof Member) { //Member로 객체생성
			Member memner = (Member) obj;   // id 값 비교를 위해 강제 형변환
			if(id.equalsIgnoreCase(memner.id)) { // 문자열비교 equalsIgnoreCase 대소문자 관계없음
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.toLowerCase().hashCode(); // 다 소문자로 바꾸기
	}
	
	
}

