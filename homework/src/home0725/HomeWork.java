package home0725;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner scn = new Scanner(System.in);
		int[] list = null;
		String[] name = null;
		int[] price = null;

		boolean run = true;
		while (run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();

			switch (selectNo) {

			case 1:
				System.out.println("상품 수를 입력하세요.");
				int itemNo = scn.nextInt();
				list = new int[itemNo];
				break;
			case 2:
				for (int i = 0; i < list.length; i++) {
					System.out.println("상품을 입력하세요");
					String name1 = scn.nextLine();
					scn.nextLine();
					name = new String[] {name1};
					
					System.out.println("가격을 입력하세요");
					int price1 = Integer.parseInt(scn.nextLine());
					price = new int[] {price1};
				}
				break;

			case 3:
				for (int i = 0; i < name.length; i++) {
					for(int j = 0; j < price.length; j++) {
					System.out.print(list.length + " " + name[i] + " : " + price[j]+ "\n");
					}
				}

				break;
			case 4:
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

	}

}