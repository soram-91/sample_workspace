package co.edu.compound;

/*
 *  자동차(Object) -> class
 */
public class Car {
	// 속성: 필드.
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight;
	double width;
	
	// 생성자: 필드의 초기값을 지정.
	public Car() {
		System.out.println("생성자 호출.");
		maxSpeed = 200;
	}
	public Car(String model, int maxSpeed, int speed, int price) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.price = price;
			
	}
	// 동작: 메소드.
	public void setSpeed(int speed) {
		this.speed = speed; // 우선순위 : 변수(int speed) > 속성값(this.speed)
	}
	public void showSpeed() {
		System.out.println("현재 속도는 " + speed + " 입니다.");
	}

	public void run() {
		System.out.println(model + " 가 달립니다.");
	}

	public void start() {
		System.out.println(model + " 가 출발합니다.");
	}

	public void stop() {
		System.out.println(model + " 가 멈춥니다.");
	}
	
}
