package home0725;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeW2 extends Store{
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Store str = new Store();
		List<Store> store = new ArrayList<Store>();
		boolean run = true;
		while (run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();

			switch (selectNo) {

			case 1:
				System.out.println("상품 수를 입력하세요.");
				int itemNo = scn.nextInt();
				str.setItemNo(itemNo);
				break;
			case 2:
				for (int i = 0; i < store.size(); i++) {
					System.out.println("상품을 입력하세요");
					String name = scn.nextLine();
										
					System.out.println("가격을 입력하세요");
					String price = scn.nextLine();

					store.add(i, str);
					
				}
				break;
			case 3:
				for(int i = 0; i< store.size(); i++) {
					
					
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

