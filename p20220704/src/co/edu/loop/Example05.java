package co.edu.loop;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			

			int menu = scn.nextInt();
			if (menu == 1) {
				int amt = scn.nextInt();
				balance += amt;
				System.out.println("선택> "+ menu +"\n예금액>" + amt);
			} else if (menu == 2) {
				int amt = scn.nextInt();
				balance -= amt;
				System.out.println("선택> "+ menu +"\n출금액>" +amt);
			} else if (menu == 3) {
				System.out.println("선택> "+ menu +"\n잔고>" + balance);
			} else if (menu == 4) {
				System.out.println("선택> "+ menu);
				break;
			}
		}

		System.out.println("\n프로그램 종료");
	}

}
