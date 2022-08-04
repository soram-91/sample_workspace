package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class Application {
	Scanner scn = new Scanner(System.in);

	public Application() {
		// 실행 하는 곳
		run();
	}

	private void run() {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 전체조회  2. 단건 조회  3. 회원 입력  4. 회원 수정  5. 회원 삭제 6.종료");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(scn.nextLine());
			switch (menuNo) {
			// 전체조회
			case 1:
				// MemberManagement mm = new MemberManagement();
				List<Member> list = MemberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("데이터가 한건도 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}
				}
				break;
			// 단건 조회
			case 2:
				System.out.println("조회할 ID 입력>");
				String id = scn.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);
				if (member == null) {
					System.out.println("등록되지 않은 ID입니다.");
				} else {
					System.out.println(member.toString());
				}
				break;
			// 입력
			case 3:
				Member member2 = new Member();
				System.out.println("++++++++++회원등록++++++++++");

				System.out.println("ID>");
				String str = scn.nextLine();
				member2.setId(str);

				System.out.println("PW");
				String pw = scn.nextLine();
				member2.setPw(pw);

				System.out.println("이름>");
				String name = scn.nextLine();
				member2.setName(name);

				int result = MemberManagement.getInstance().insertMember(member2);
				if (result == 1) {
					System.out.println("정상 등록되었습니다.");
				} else {
					System.out.println("입력 실패했습니다.");
				}
				break;

			// 수정
			case 4:
				Member member3 = new Member();
				System.out.println("++++++++++회원수정++++++++++");

				System.out.println("ID>");
				String updateID = scn.nextLine();
				member3.setId(updateID);

				System.out.println("PW>");
				String updatePw = scn.nextLine();
				member3.setPw(updatePw);

				int result2 = MemberManagement.getInstance().updateMember(member3);
				if (result2 == 1) {
					System.out.println("정상적으로 수정되었습니다.");
				} else {
					System.out.println("수정이 실패했습니다.");
				}

				break;
			// 삭제
			case 5:
				System.out.println("삭제할 ID 입력>");
				String deleteId = scn.nextLine();

				int result3 = MemberManagement.getInstance().deleteMember(deleteId);

				if (result3 == 1) {
					System.out.println("정상적으로 삭제되었습니다.");
				} else {
					System.out.println("삭제가 실패했습니다.");
				}

				break;
			case 6:
				System.out.println("end of prog");
				flag = false;

			default:
				break;
			}
		}

	}
}
