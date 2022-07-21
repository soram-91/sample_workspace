package home0720;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		Scanner scn = new Scanner(System.in);
		System.out.println("m값을 입력하세요>");
		int m = scn.nextInt();
		System.out.println("n값을 입력하세요>");
		int n = scn.nextInt();
	
		for (int i = 1; i <= n ; i++) {
			System.out.println(m + " x " + i + " = " + m * i);
		}
		
	}
}
