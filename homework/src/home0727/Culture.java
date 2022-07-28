package home0727;

public abstract class Culture {
	String title;
	int dirNo;
	int actNo;
	int audNo; // 관객수
	int score;

	public Culture() {
	}

	public Culture(String title, int dirNo, int actNo) {
		this.title = title;
		this.dirNo = dirNo;
		this.actNo = actNo;
	}

	// 메소드
	// 관객수와 총점(관객들의 평점의 총합)을 누적시키는 기능
	public void setTotalScore(int score) {
		this.score += score;
		this.audNo++;
	}

	// 평점을 구하는 기능
	public String getGrade() {
		String grade = null;
		double gradeNo = (double) score / audNo;
		
		if (gradeNo < 1.5) {
			grade = "☆";
		} else if (gradeNo < 2.5) {
			grade = "☆☆";
		} else if (gradeNo < 3.5) {
			grade = "☆☆☆";
		} else if (gradeNo < 4.5) {
			grade = "☆☆☆☆";
		} else if (4.5 <= gradeNo) {
			grade = "☆☆☆☆☆";
		}

		return grade;
	}

	// 정보를 출력하는 추상메소드
	public abstract void getInformation();

}
