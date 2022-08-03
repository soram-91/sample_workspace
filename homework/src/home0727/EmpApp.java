package home0727;

public class EmpApp {
	public static void main(String[] args) {
		Employee emp = new EmpDept("이지나", 3000, "교육부"); // 부모클래스 자식클래스
		emp.getInformation();
		emp.print();

	}
}
