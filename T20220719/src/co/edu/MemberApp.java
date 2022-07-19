package co.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {
	Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급

		int selectNo;
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("원하시는 번호를 입력하세요");
			selectNo = Integer.parseInt(scn.nextLine());
			switch (selectNo) {
			case 1:
				System.out.println("회원아이디를 입력하세요");
				int id = Integer.parseInt(scn.nextLine());
				System.out.println("회원이름을 입력하세요");
				String name = scn.nextLine();
				System.out.println("연락처를 입력하세요");
				String phone = scn.nextLine();
				System.out.println("1.도서반 2.축구반 3.수영반");
				System.out.println("선택하세요.");
				int classNo =Integer.parseInt(scn.nextLine());
				if(classNo == 1) {
					
					System.out.println("반장이름을 입력하세요.");
					String info1 = scn.nextLine();
					System.out.println("강의실이름을 입력하세요.");
					String info2 = scn.nextLine();
					addMember(new BookMember(id, name, phone, info1, info2));
					
					
					
				} else if(classNo == 2) {
					
					System.out.println("축구선생님이름을 입력하세요.");
					String info1 = scn.nextLine();
					System.out.println("락커룸 이름을 입력하세요.");
					String info2 = scn.nextLine();
					addMember(new SoccerMember(id, name, phone, info1, info2));
				
				} else if(classNo == 3) {
					
					System.out.println("수영강사이름을 입력하세요.");
					String info1 = scn.nextLine();
					System.out.println("등급을 입력하세요.");
					String info2 = scn.nextLine();
					addMember(new SwimMember(id, name, phone, info1, info2));
				}
							
				break;
			case 2:
				System.out.println("수정할 아이디를 입력하세요.");
				int id2 = Integer.parseInt(scn.nextLine());
				
				System.out.println("수정할 연락처를 입력하세요.");
				String phone2 = scn.nextLine();
				
				modifyMember(new Member(id2,null,phone2));
				break;
				
			case 3:
				for(int i =0; i< members.size() ;i++) {
					System.out.println(members.get(i).toString());
				}
				break;
				
			case 9:
				System.out.println("종료.");
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}
	// 컬렉션

	@Override // 회원아이디, 회원명, 연락처 정보.
	public void addMember(Member member) {
		members.add(member);
	}

	@Override
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		} 
		}

	@Override
	public List<Member> memberList() {
		return members;
	}
}
