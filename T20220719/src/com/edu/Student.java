package com.edu;

public class Student {
	// 학생번호, 학생이름, 점수
	private String studNo;
	private String studName;
	private int score;

	public Student() {
	}
	
	public Student(String studNo , int score) {
		super();
		this.studNo = studNo;
		this.score = score;
	}
	
	public Student(String studName, String studNo , int score) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.score = score;
	}
	


	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "학생정보 [학생번호: " + studNo + ", 학생이름: " + studName + ", 점수: " + score + "]";
	}

}
