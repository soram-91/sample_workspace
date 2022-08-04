package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	private String stName;
	private String grade;
	
	// 생성자
	public SwimMember(int memberId, String memberName, String phone, String stName, String grade) {
		super(memberId, memberName,phone);
		this.stName = stName;
		this.grade = grade;
	}
	
	
	public String getStName() {
		return stName;
	}


	public void setStName(String stName) {
		this.stName = stName;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "SwimMember [아이디 : " + getMemberId() + "이름: " + getMemberName() + "강사이름: " + stName + ", 등급: " + grade + "]";
	}
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
}
