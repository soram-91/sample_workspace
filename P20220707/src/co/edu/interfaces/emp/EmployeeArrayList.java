package co.edu.interfaces.emp;

import java.util.ArrayList;

/*
 *  컬렉션 기반으로 기능 구현. // ArrayListEx 참고.
 */
public class EmployeeArrayList implements EmployeeList {
	
	ArrayList<Employee> list;
//	int empNum; // 필요없음. (안써도 됨)
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	
	// 배열 초기화.
	@Override
	public void init() {
		empList.add(new Employee());
	}
	
	// 사원정보 입력.
	@Override
	public void input() {
		
	}

	// 사번에 해당하는 정보 조회.
	@Override
	public Employee search(int empId) {
		
		return null;
	}

	// 전체 출력.
	@Override
	public void printList() {
		
		
	}

}
