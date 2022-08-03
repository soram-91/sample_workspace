package com.yedam.review;

public class EmpApp {
	public static void main(String[] args) {
		Employee app = new EmpDept("이지나", 3000, "교육부");  // 부모클래스 이지만 내용은 자식클래스의 오버라이딩한 것을 가져옴.
		app.getInformation();
		app.print();
	}
}
