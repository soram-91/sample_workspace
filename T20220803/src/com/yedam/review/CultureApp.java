package com.yedam.review;

public class CultureApp {
	public static void main(String[] args) {
		Culture app1 = new Movie("추격자", 7,5);
		app1.setTotalScore(4);
		app1.setTotalScore(5);
		app1.setTotalScore(3);
		app1.setTotalScore(5);
		app1.setTotalScore(4);
		app1.getInformation();
		
		Culture app2 = new Performance("지킬앤하이드", 9,10);
		app2.setTotalScore(5);
		app2.setTotalScore(1);
		app2.setTotalScore(2);
		app2.setTotalScore(3);
		app2.setTotalScore(4);
		app2.setTotalScore(5);
		app2.setTotalScore(1);
		app2.setTotalScore(2);
		app2.setTotalScore(3);
		app2.setTotalScore(4);
		app2.getInformation();
		
	}
}
