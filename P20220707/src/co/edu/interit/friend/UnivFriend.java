package co.edu.interit.friend;

/*
 *  학교친구.
 */

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: "
				+ major + "]";
	}
	@Override // 없어도 가능
	public void showInfo() {
		// 친구이름, 연락처, 학교이름, 전공
		System.out.printf("학교친구 [이름: %s, 연락처: %s, 학교: %s, 전공: %s]\n", getName(), getPhone(), univ, major);
		
	}
	

}
