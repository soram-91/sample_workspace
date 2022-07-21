package home0720;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 
		// 100의 배수가 아닐 때 또는 400의 배수일때입니다.

		// 4년마다 윤년, 400년마다 윤년, 100년마다는 윤년x(=100의 배수가 아니면 윤년)

		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		Scanner scn = new Scanner(System.in);
		
		int x = 0;
		
		if (x % 400 == 0) {
			System.out.println("년도를 입력하세요");
			x = Integer.parseInt(scn.nextLine());	
			if (x % 4 == 0 && x % 100 != 0 ) {
				System.out.println(x + "년은 윤년입니다.");
			} else {
				System.out.println(x + "년은 윤년이 아닙니다.");
			}

		}

	}

}
