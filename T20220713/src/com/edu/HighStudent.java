package com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.
	private String hiTName;
	private String hiGrade;
	// 생성자.
	
	public HighStudent(String hiTName, String hiGrade) {
		super();
		this.hiTName = hiTName;
		this.hiGrade = hiGrade;
	}

	// toString()
	@Override
	public String toString() {
		return "고등학생정보 [고등학생이름: " + getStudName()+ "학생번호: " + getStudNo()+ "점수: " + getScore()+ "담임교사: " + hiTName + ", 학년 정보: " + hiGrade + "]";
	}
	
	

}
