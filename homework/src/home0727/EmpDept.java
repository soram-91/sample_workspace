package home0727;

import java.util.Scanner;

public class EmpDept extends Employee {
	//- Employee 클래스를 상속한다.
	// - 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	// - 추가된 필드의 getter를 정의한다.
	// - Employee 클래스의 메소드를 오버라이딩한다.
	// (1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
	// (2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
	String dMTName;
	
	public EmpDept() {
		
	}
	public EmpDept(String name,int salary,String dMTName) {
		this.name = name;
		this.salary = salary;
		this.dMTName = dMTName;
	}
	
	public String getdMTName() {
		return dMTName;
	}
	
	//이름과 연봉, 부서를 출력하는 기능
	@Override
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scn.nextLine();
		System.out.println("연봉을 입력하세요");
		salary = Integer.parseInt(scn.nextLine());
		System.out.println("부서를 입력하세요");
		dMTName = scn.nextLine();
		System.out.println("이름: " + name+ " 연봉: "+ salary+ " 부서: " + dMTName);
	}
	
	//"수퍼클래스\n서브클래스"란 문구를 출력하는 기능
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
}
