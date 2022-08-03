package com.yedam.review;

public abstract class Culture {
//	1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.

	protected String title;
	protected int director;
	protected int actor;
	protected int audience;
	protected int totalScore;
	
	public Culture(String title, int director, int actor) {
		this.title =title;
		this.director = director;
		this.actor = actor;
	}
	
	// 관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) {
		audience++;
		totalScore += score;		
	}

	// 평점을 구하는 기능
	public String getGrade() {
		int avg = totalScore/audience;
		String grade = null;
		switch(avg) {
		case 1: grade = "☆";
			break;
		case 2: grade = "☆☆";
			break;
		case 3: grade = "☆☆☆";
			break;
		case 4: grade = "☆☆☆☆";
			break;
		case 5: grade = "☆☆☆☆☆";
			break;
		}
		return grade;
	}
	// 정보를 출력하는 추상메소드
	public abstract void getInformation();
}
