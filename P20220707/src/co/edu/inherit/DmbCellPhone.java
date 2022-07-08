package co.edu.inherit;

/*
 * 상속 : 자식이 부모를 선택(extends)
 */
public class DmbCellPhone extends CellPhone {
	private int channel;

	public DmbCellPhone() {
		super(); // 부모 생성자 호출.
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
//		super.model = model;  // 부모 클래스 CellPhone의 [필드의 model]이 private여서 수정 불가.
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmb화면 on");
	}

	public void turnOff() {
		System.out.println("dmb화면 off");
	}

	// overriding : 재정의. (부모 CellPhone 의 메소드를 재정의 하겠습니다.)

	@Override // 부모가 가지고 있는 기능의 타입을 물려받아서 그대로 쓰겠습니다.
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model 명은 " + getModel() + ", 색상은 " + getColor() + "입니다." + " ,채널은 " + channel + "입니다.";
	}

}
