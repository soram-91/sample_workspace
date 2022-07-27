package home0727;

import java.util.Scanner;

public class Performance extends Culture {
	String genre;
	
	public Performance() {}
	public Performance(String genre) {
		this.genre = genre;
	}
	
	// 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("공연 제목을 입력하세요");
		title = scn.nextLine();
		System.out.println("참여 감독 수를 입력하세요");
		dirNo = Integer.parseInt(scn.nextLine());
		System.out.println("참여 배우 수를 입력하세요");
		actNo = Integer.parseInt(scn.nextLine());
		
		System.out.println("공연총점을 입력하세요");
		score = Integer.parseInt(scn.nextLine());
		System.out.println("공연평점을 입력하세요");
		String grade = scn.nextLine();
		System.out.print("공연제목:"+title + "\n감독:" + dirNo + "\n배우:" + actNo + "\n공연총점:" +score + "\n공연평점:" + grade +"\n");
		System.out.println("===================================");
		
	}
}
