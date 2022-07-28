package home0727;

public class Movie extends Culture {
	String genre;
	

	public Movie(String title, int dirNo, int actNo, String genre) {
		super(title, dirNo, actNo);
		this.genre = genre;
	}


	// 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {

		System.out.printf(" 영화제목:%s\n 감독:%d\n 배우:%d\n 영화총점:%d\n 영화평점:%s\n", title, dirNo, actNo,score,getGrade());				
		System.out.println("===================================");
		
	}
}
