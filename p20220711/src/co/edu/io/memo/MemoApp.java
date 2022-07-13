package co.edu.io.memo;

import java.io.FileInputStream;
import java.util.Scanner;

// 등록, 조회, 삭제, 종료

public class MemoApp {
	public static void main(String[] args) {
		
		// MemoManager 기능 구현.
		MemoManager memoApp = MemoManager.getInstance();		// MemoManager 클래스의 생성자가 싱글톤(private)

		Scanner scn = new Scanner(System.in);
		int selectNo;
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.조회 3.삭제 4.종료");
			System.out.print("메뉴선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			switch (selectNo) {
			case 1:
				memoApp.inputData();
				break;
			case 2:
				memoApp.search();
				break;
			case 3:
				memoApp.deleteData();
				break;
			case 4:
				memoApp.storeToFile();
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
		
		
	}
}
