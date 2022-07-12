package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;

/*
 *  1.목록 2.등록 3.조회(작성자) 4.삭제
 */

public class BoardDAO {
	// 싱글톤.
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<>();
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 목록.
	public List<Board> boardList() {
		return list;
	}

	// 등록.
	public void add(Board board) {
		list.add(board);
	}

	// 조회(작성자)
	public List<Board> search(String Writer) {
		List<Board> list = new ArrayList<>();

		for (Board board : this.list) { // list : 필드
			if (board.getWriter().equals(Writer)) {
				list.add(board);
			}
		}
		return list;
	}

	// 삭제.
	public void remove(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
			}
		}

	}
}
