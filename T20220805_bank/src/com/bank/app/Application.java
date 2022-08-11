package com.bank.app;

import java.util.Scanner;

import com.bank.member.MemberService;

public class Application {

	Scanner sc = new Scanner(System.in);
	int menuNo = 0;
	MemberService ms = new MemberService();

	public Application() {
		run();
	}

	private void run() {
		System.out.println("1.로그인 | 2.종료");
		System.out.println("입력>");
		menuNo = Integer.parseInt(sc.nextLine());
		switch (menuNo) {
		case 1:
			// 로그인하는 기능
			ms.doLogin();
			if (MemberService.memberInfo != null) {
				new ManageMent();
			}
			break;
		case 2:
			System.out.println("프로그램 종료");
			break;
		}
	}
}
