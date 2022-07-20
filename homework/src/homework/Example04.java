package homework;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// 첫번째 수 : 7.3
		// 두번째 수 : 2.5
		// 결과값 : 첫번째 수 / 두번째 수
		Scanner scn = new Scanner(System.in);
		System.out.println("입력하세요");
		double x = scn.nextDouble();
		double y = scn.nextDouble();
		
		double result = x / y;
		if(y == 0 || y == 0.0) {
			System.out.println("결과 : 무한대");
		} else {
			System.out.println("결과 : " + result);
		}
	}
}
