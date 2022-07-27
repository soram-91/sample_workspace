package home0727;

public abstract class Culture {
	String title;
	int dirNo;
	int actNo;
	int audNo;  // 관객수
	int score;
	
	public Culture() {}
	public Culture(String title, int dirNo, int actNo) {
		this.title = title;
		this.dirNo = dirNo;
		this.actNo = actNo;
	}
	// 메소드
	// 관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) {
		score++;
		audNo++;
	}
	// 평점을 구하는 기능
/*	public String getGrade() {
		String grade
		return grade;
	}*/
	// 정보를 출력하는 추상메소드
	public abstract void getInformation();
	
}
