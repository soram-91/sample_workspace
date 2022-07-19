package co.edu;

public class SoccerMember extends Member{
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	String stName;
	String lockerName;
	
	public SoccerMember(int memberId, String memberName, String phone, String stName, String lockerName) {
		this.stName = stName;
		this.lockerName = lockerName;
	}
	

	@Override
	public String toString() {
		return "SoccerMember [회원아이디: " +getMemberId()+", 회원이름: " + getMemberName() +", 연락처: " +getPhone()+ ", 코치이름: " + stName + ", 락커룸: " + lockerName + "]";
	}
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
}
