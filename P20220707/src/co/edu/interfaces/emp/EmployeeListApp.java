package co.edu.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {
		
		EmployeeList app = EmployeeArray.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.사원수(초기화) 2.사원입력 3.사원리스트 4.상세검색 9.종료");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				app.init();
			}else if (selectNo == 2) {
				app.input();
			}else if (selectNo == 3) {
				app.printList();
			}else if (selectNo == 4) {
				System.out.print("검색할 사번입력> ");
				int empId = scn.nextInt();
				Employee emp = app.search(empId);
				System.out.println(emp.getDetailInfo()); 
				
			}else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while
		System.out.println("포르개름 종료.");
	}
}
