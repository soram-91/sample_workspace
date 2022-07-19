package co.edu;

// Member 상속.
public class BookMember extends Member{
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String banName;
	private String className;
	
	public BookMember(int memberId, String memberName, String phone, String banName, String className) {
		super(memberId,memberName,phone);
		this.banName = banName;
		this.className = className;
	}
	
	@Override
	public String toString() {
		return "BookMember [회원아이디: " +getMemberId()+", 회원이름: " + getMemberName() +", 연락처: " +getPhone()+ ", 반장이름: " + banName + ", 강의실: " + className + "]";
	}
		
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실   // toString 오버라이딩.
}
