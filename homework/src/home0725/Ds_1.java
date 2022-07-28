package home0725;

import java.util.Scanner;

public class Ds_1 {

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

		boolean run = true;
		int goodsnum = 0;
		int[] price = null;
		String[] goodsname = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴를 선택하세요> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("상품 수를 입력하세요 > ");
				goodsnum = Integer.parseInt(scn.nextLine());
				price = new int[goodsnum];
				goodsname = new String[goodsnum];
				break;
			case 2:

				for (int i = 0; i < price.length; i++) {
					System.out.printf("상품 이름과 가격을 입력하세요");
					goodsname[i] = scn.nextLine();
					price[i] = Integer.parseInt(scn.nextLine());
				}
//		            for (int i = 0; i < goodsnum; i++) {
//		               System.out.println("상품의 이름을 입력하세요");
//		               String goodsname2 = scn.nextLine();
//		               goodsname[i] = goodsname2;
//		            
//		            for (int j = 0; j < goodsnum; j++) {            
//		               System.out.println("상품의 가격을 입력하세요");
//		               int goodsprice1 = scn.nextInt();
//		               goodsprice[j] = goodsprice1;
//		            }
//		            }
				break;
			case 3:
				for (int i = 0; i < price.length; i++) {
					System.out.println("상품명:" + goodsname[i] + ", 상품가격: " + price[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				String maxItem = null;
				for (int i = 0; i < price.length; i++) {
					sum += price[i];
					if (price[i] > max) {
						max = price[i];
						maxItem = goodsname[i];
						}
				}
				sum -= max;
				System.out.println("가장 가격이 높은 것은" + maxItem + " 입니다.");
				System.out.println(max + "원 제외 총합은 " + sum + "원 입니다.");

				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}

		}

	}

}
