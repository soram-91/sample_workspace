package home0727;

import java.util.Scanner;

//관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.

public class CultureApp {
	public static void main(String[] args) {

		// String title, int dirNo, int actNo, String genre
		Movie m = new Movie("추격자", 7, 5, "스릴러");
		Performance p = new Performance("지킬앤하이드", 9, 10, "뮤지컬");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("영화관객수를 입력하세요");
		int audNo = Integer.parseInt(scn.nextLine());
		
		for(int i = 1; i <= audNo; i++) {
			System.out.println("평점을 입력하세요(최고:5점)");
			int score = Integer.parseInt(scn.nextLine());
			m.setTotalScore(score);		
		}
		
		System.out.println("공연관객수를 입력하세요");
		int audNo2 = Integer.parseInt(scn.nextLine());
		
		for(int i = 1; i <= audNo2; i++) {
			System.out.println("평점을 입력하세요(최고:5점)");
			int score = Integer.parseInt(scn.nextLine());
			p.setTotalScore(score);
		}	
		
		m.getInformation();
		p.getInformation();

	}
}
