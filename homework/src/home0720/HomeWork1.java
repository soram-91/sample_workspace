package home0720;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0 // x는 양수 y도 양수
		// 제2사분면 : x<0, y>0 // x는 음수 y는 양수
		// 제3사분면 : x<0, y<0 // x는 음수 y도 음수
		// 제4사분면 : x>0, y<0 // x는 양수, y는 음수
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		Scanner scn = new Scanner(System.in);
		System.out.println("x값을 입력하세요");
		int x = scn.nextInt();
		System.out.println("y값을 입력하세요");
		int y = scn.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("제1사분면");
		} else if (x < 0 && y > 0) {
			System.out.println("제2사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("제3사분면");
		} else if (x > 0 && y < 0) {
			System.out.println("제4사분면");
		} 
	}
}
