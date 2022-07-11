package co.edu.interit.friend;

public class ComFriend extends Friend {
	private String company;
	private String department;

	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	@Override
	public String toString() {
		return  "회사친구 [이름: " + getName() + ", 연락처: " + getPhone() + ", 회사: " + company
				+ ", 부서: " + department + "]";
	}
	
	@Override
	public void showInfo() {
		// 친구이름, 연락처, 회사이름, 부서이름
		System.out.printf("회사친구 [이름:%s, 연락처:%s, 회사: %s, 부서: %s]\n", getName(), getPhone(), company, department);
	}

}
