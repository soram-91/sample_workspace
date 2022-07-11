package co.edu.interit.friend;

public class Friend {
	private String name;
	private String phone;
	
	// 생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "친구 [이름: " + name + ", 연락처: " + phone + "]";
	}
	
	public void showInfo() {
		// 친구이름, 연락처
		System.out.println("친구 [이름: " + name + ", 연락처: " + phone + "]");
	}
	
}

