package co.edu.interfaces.emp;

import java.util.ArrayList;

/*
 *  컬렉션 기반으로 기능 구현. // ArrayListEx 참고.
 */
public class EmployeeArrayList implements EmployeeList {
	
	ArrayList<Employee> list;
	int empNum; // 필요없음. (안써도 됨)
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	
	@Override
	public void init() {
		empList.add(new Employee());
	}

	@Override
	public void input() {
			
	}

	@Override
	public Employee search(int empId) {
		
		return null;
	}

	@Override
	public void printList() {
		
		
	}

}
