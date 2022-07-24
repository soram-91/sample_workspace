package home0724;

import java.util.Scanner;

public class Home1 {
	public static void main(String[] args) {
		
		// (1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		
		Scanner scn = new Scanner(System.in);
		System.out.println("x의 값을 입력하세요");
		int x = scn.nextInt();

		boolean result = false;
		if (x > 10 && x < 20) {
			result = true;
			System.out.println(result);
		} else {
			result = false;
			System.out.println(result);
		}				
	}
}
