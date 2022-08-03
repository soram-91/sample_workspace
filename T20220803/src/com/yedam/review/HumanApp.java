package com.yedam.review;

public class HumanApp {
	public static void main(String[] args) {
		Human app1 = new StandardWeightInfo("홍길동", 168, 45);
		app1.getInformation();
		Human app2 = new ObesityInfo("박둘이", 168, 90);
		app2.getInformation();
	}
}
