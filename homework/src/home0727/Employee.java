package home0727;

import java.util.Scanner;

//1) Employee 클래스를 정의한다.
//	- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 각 필드의 getter만 존재한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//	(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
public class Employee {
	String name;
	int salary;
	
	public Employee() {
		
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	// 이름과 연봉을 출력하는 기능
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scn.nextLine();
		System.out.println("연봉을 입력하세요");
		salary = Integer.parseInt(scn.nextLine());
		System.out.println("이름: " + name+ " 연봉: "+ salary);
	}
	
	// "수퍼클래스"란 문구를 출력하는 기능
	public void print() {
		System.out.println("수퍼클래스");
	}
	
}
