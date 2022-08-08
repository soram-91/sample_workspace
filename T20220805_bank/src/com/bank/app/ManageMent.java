package com.bank.app;

import java.util.Scanner;

import com.bank.account.AccountService;
import com.bank.loan.LoanService;
import com.bank.member.MemberService;

public class ManageMent {
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	AccountService as = new AccountService();
	LoanService ls = new LoanService();

	int menuNo = 0;

	public ManageMent() {
		bankJob();
	}

	private void bankJob() {

		while (true) {
			menuInfo();
			if (MemberService.memberInfo.getRole().equals("1")) {

				if (menuNo == 1) {
					// 고객 등록
					ms.registerCustomer();

				} else if (menuNo == 2) {
					as.makeAccount();
				} else if (menuNo == 3) {
					// 입출금
					as.money();
				} else if (menuNo == 4) {
					as.transfer();
				} else if (menuNo == 5) {
					as.deleteAccount();
				} else if (menuNo == 6) {
					System.out.println("1.대출승인 | 2. 대출 상태 변경");
					int menu = Integer.parseInt(sc.nextLine());
					if (menu == 1) {
						// 대출승인
						ls.insertLoan();
					} else if (menu == 2) {
						ls.updateLoan();
					}
				}else if (menuNo == 7) {
					ms.logout();
					new Application();
				}
				// 일반 고객
			} else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menuNo == 1) {
					as.getAccount();
				} else if (menuNo == 2) {
					as.money();
				} else if (menuNo == 3) {
					as.transfer();
				} else if (menuNo == 4) {

					System.out.println("1.상환 | 2.대출 조회");
					int menu = Integer.parseInt(sc.nextLine());

					if (menu == 1) {
						ls.updateMoney();
					} else if (menu == 2) {
						ls.loanInfo();
					}
				}  else if (menuNo == 5) {
					ms.logout();
					new Application();
				}
			}
		}
	}

	private void menuInfo() {

		if (MemberService.memberInfo.getRole().equals("1")) {
			// role = 1 : 은행원

			System.out.println("1.고객등록 | 2.계좌개설 | 3.입출금 | 4.계좌이체 | 5.계좌해지 | 6.대출 | 7. 로그아웃");

		} else if (MemberService.memberInfo.getRole().equals("0")) {
			// role = 0 : 일반사용자

			System.out.println("1.계좌조회 | 2.입출금 | 3.계좌이체 | 4.대출 | 5.로그아웃");
		}
		System.out.println("입력> ");
		menuNo = Integer.parseInt(sc.nextLine());

	}

}
