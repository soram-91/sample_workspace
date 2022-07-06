package co.edu.reference;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생 수
		int[] scores = null; // 참조변수 초기화.
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("\n1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.print("선택> \n");

			int selectNum = Integer.parseInt(scn.nextLine()); // nextInt()=>int, nextLine()=>String
			
			if (scores == null) {
				if(!(selectNum == 1 || selectNum ==5)) {
					System.out.println("학생 수를 먼저 지정하세요");
					continue;
				}
			}
			if (selectNum == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNum == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNum == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> " + scores[i] + "\n");
				}

			} else if (selectNum == 4) {
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];

					}
				}
				System.out.print("\n최고 점수: " + max);
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					avg = (double) sum / scores.length;
				}
				System.out.print("\n평균 점수: " + avg);

			} else if (selectNum == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못된 경로입니다.");
			}

		}
		System.out.println("프로그램 종료");
	}
}
