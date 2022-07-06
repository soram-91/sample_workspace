package co.edu.compound;

/*
 * 이름, 연락처, email, 생일,키, 몸무게
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase(두문자의 조합에서 두번째글자는 대문자), 영문이 숫자보다 먼저)
	// public , private : 생성자의 접근 제한.
	private String name;
	private String tel;
	private String email;
	private String birthDate;
	private double height;
	private double weight;

	// 생성자 : 기본 생성자를 생성.
	public Friend() {

	}

	// 메소드.
	// 이름, 연락처를 보여주는 showInfo()
	public void showInfo() {
		System.out.println("이름: " + name + ", 연락처: " + tel);
	}

	// set : 값을 입력.
	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("잘못 입력되었습니다.");
			this.height = 165.0;
		} else {
			this.height = height;
		}
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("잘못 입력되었습니다.");
			this.weight = 50.0;
		} else {
			this.weight = weight;
		}
	}

	// get 메소드 : 값을 가져옴. get - return
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public double getHeight() {

		return height;
	}

	public double getWeight() {
		return weight;
	}

}
