package chapter11;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	public Member() {
		
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {		//id끼리만 비교하겠습니다.
				return true;
			}
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		
		return "이 클래스의 id는 " + this.id + "입니다.";
	}

}
