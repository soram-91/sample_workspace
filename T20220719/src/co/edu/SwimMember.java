package co.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	private String stName;
	private String grade;
	
	// 생성자
	public SwimMember(int memberId, String memberName, String phone, String stName, String grade) {
		super(memberId, memberName,phone);
		this.stName = stName;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "SwimMember [회원아이디 : " + getMemberId() + ", 회원이름: " + getMemberName() +", 연락처: " +getPhone()+", 강사이름: " + stName + ", 등급: " + grade + "]";
	}
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
}
