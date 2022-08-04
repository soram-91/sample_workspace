package com.yedam.member;

public class Employees {
	// 필드
	private int employee_id;
	private String last_name;
	private String email;
	private int salary;

	// 메소드
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", last_name=" + last_name + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	

}
