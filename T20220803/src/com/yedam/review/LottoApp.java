package com.yedam.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	Scanner sc = new Scanner(System.in);
	List<int[]> list = new ArrayList<>(); // list 의 타입이 int[] 배열

	protected void run() {

		boolean run = true;
		while (run) {
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				makeLotto();

				break;
			case 2:
				showInfo();

				break;
			case 99:
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}

	private void makeLotto() {
		System.out.println("금액을 투입해주세요.");
		System.out.println(">");
		int money = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < money / 1000 /*로또 횟수*/ ; i++) {
			list.add(makeNumber());
		}
		System.out.println("번호 출력 완료");
	}

	private int[] makeNumber() {
		int[] lottoNo = new int[6]; // 로또 번호 한번에 6개 출력

		for (int i = 0; i < 6; i++) {
			int randomNo = (int) (Math.random() * 45) + 1;

			// 첫번째 값은 중복체크 할 필요 없음.
			if (i > 0) {
				// j=0, i번째까지, i = 3(index = 0,1,2,3)
				for (int j = 0; j < i; j++) {
					// 40,30,20 <- 배열에 들어있는 값
					// 20 < randomNo
					if (lottoNo[j] == randomNo) {
						i -= 1;
//						System.out.println("중복제거!");
						break;
					} else if ((j + 1) == i) {
						lottoNo[i] = randomNo;
					}
				}
			} else {
				lottoNo[i] = randomNo;
			}
		}
		return lottoNo;
	}

	private void showInfo() {
		System.out.println("구매한 금액 > " + (list.size() * 1000) + "원");
		for (int i = 0; i < list.size(); i++) {
			// 1번, 2번
			System.out.print((i % 5 + 1) + "번>");
			// 로또 번호 출력
			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
			// &&, &
			// i=0, i % 5 == 0
			if ((i + 1) % 5 == 0) {
				System.out.println("------------------------------------------");
			}
		}
	}
}
