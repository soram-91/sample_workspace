package co.edu;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플" };

		boolean isExist = false;
		System.out.println("값을 입력하세요> ");
		String fruit = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if (fruit.equals(fruits[i])) {
				System.out.println(fruits[i] + "는 " + (i + 1) + "번째 위치에 있습니다.");
				isExist = true;
				break;
			}

		}
		if (!isExist) {
			System.out.println("찾는 과일이 없습니다.");
		}
	}

}
