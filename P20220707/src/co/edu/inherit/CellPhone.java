package co.edu.inherit;
/*
 *  상속 (부모 <- 자식)
 *  CellPhone(부모) <- DmbPhone(자식)
 */
public class CellPhone extends Object { // 모든 클래스는 기본적으로 Object 상속. 
	// field.
	private String model;
	private String color;
	
	// constructor 생성자.
	public CellPhone() {} // default constructor 기본생성자.
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("bell");
	}
	public void sendVoice() {
		System.out.println("메시지 전송");
	}
	public void receiveVoice() {
		System.out.println("메시지 수신");
	}
	
	// get, set
	public String getModel() {
		System.out.println(model);
		return model;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 재정의 
	
	@Override
	public String toString() {  // 객체가 가지고 있는 정보를 문자열로 반환.
		return "model 명은 " + model + ", 색상은 " + color + "입니다.";
	}
	

	
	
}
