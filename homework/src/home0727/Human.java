package home0727;

import java.util.Scanner;

//1) Human 클래스를 정의한다.
//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
public class Human {
	String name;
	double height;
	double weight;
	
	public Human() {
		
	}
	
	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scn.nextLine();
		System.out.println("키를 입력하세요");
		height = Double.parseDouble(scn.nextLine());
		System.out.println("몸무게를 입력하세요");
		weight = Double.parseDouble(scn.nextLine());
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight );
	}
}
