package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.

	private String prof;
	private String mClass;
	
	// 생성자.
	public CollegeStudent(String prof, String mClass) {
		super();
		this.prof = prof;
		this.mClass = mClass;
	}
	
	public CollegeStudent(String studName, String studNo, int score, String prof, String mClass) {
		super(studName, studNo, score);
		this.prof = prof;
		this.mClass = mClass;
	}

	// toString()
	@Override
	public String toString() {
		return "대학생정보 [대학생 이름: " + getStudName() + ", 학생번호: " + getStudNo()+ ", 점수: " +getScore()+", 담당교수: " + prof + ", 전공과목: " + mClass + "]";
	}
	
	
}
