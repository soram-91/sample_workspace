package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1 ~ 100 임의의 수를 생성.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int temp = (int) (Math.random() * 100)+1;
		int inputVal = scn.nextInt();
		
		boolean isTrue = true;
		
		while (isTrue) {
			
			System.out.println("수를 맞춰보세요.");
			if (inputVal == temp) {
				System.out.println("맞췄습니다.");
				
				
			} else if (inputVal > temp) {
				System.out.println("더 작은 수 입니다.");
				inputVal = scn.nextInt();
				
			} else if (inputVal < temp) {
				System.out.println("더 큰 수 입니다.");
				inputVal = scn.nextInt();
			}
			System.out.println("end of prog.");
			
		}

	}
}
