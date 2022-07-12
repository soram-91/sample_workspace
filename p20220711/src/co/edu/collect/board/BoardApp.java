package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
		Scanner scn = new Scanner(System.in);
		// 메뉴 선택 => 선택값 => 구현
	
		BoardDAO app = BoardDAO.getInstance();

		System.out.println("메뉴를 선택하세요>> ");
		int num = Integer.parseInt(scn.nextLine());

		while (true) {
			if (num == 1) {
				app.boardList();
			} else if (num == 2) {
				ArrayList<Board> list = new ArrayList<>();
				
				System.out.println("제목을 입력하세요");
				String title = scn.nextLine();

				System.out.println("작성자를 입력하세요");
				String name = scn.nextLine();

				System.out.println("내용을 입력하세요");
				String content = scn.nextLine();

				list.add(new Board(title, name, content));
								
				System.out.println("정상적으로 등록되었습니다.");
				break;
				
			} else if (num == 3) {
				System.out.println("조회할 작성자를 입력하세요");
				String wName = scn.nextLine();
				app.search(wName);
				
				System.out.println("찾는 글이 없습니다.");

			} else if (num == 4) {
				System.out.println("삭제할 제목을 입력하세요");
				String tName = scn.nextLine();
				app.remove(tName);

			} else if (num == 5) {
				System.out.println("종료.");
				break;
			}
		}
	}
}
