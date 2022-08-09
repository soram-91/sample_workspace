package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner scn = new Scanner(System.in);

	// 메뉴 조회
	public void getCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		
		for(Coffee coffee: list) {
			System.out.print("메뉴 : " + coffee.getCoffeeMenu() + ", 가격 : " + coffee.getCoffeePrice()+"\n");
		}
	}

	// 메뉴 상세조회
	public void getDetailCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getDetailCoffee();
		for(int i = 0; i < list.size(); i++) {
			System.out.print("메뉴 : " + list.get(i).getCoffeeMenu() + ", 가격 : " + list.get(i).getCoffeePrice()+", 설명 : " + list.get(i).getCoffeeExplain()+"\n");
		}
	}

	// 메뉴 등록
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		System.out.println("메뉴 입력>");
		String menu = scn.nextLine();
		System.out.println("가격 입력>");
		int price = Integer.parseInt(scn.nextLine());
		System.out.println("설명 입력>");
		String explain = scn.nextLine();
		
		coffee.setCoffeeMenu(menu);
		coffee.setCoffeePrice(price);
		coffee.setCoffeeExplain(explain);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		
		if(result == 1) {
			System.out.println("메뉴 등록 완료");
		} else {
			System.out.println("메뉴 등록 실패");
		}
	}
	// 판매
	public void salesCoffee() {
		System.out.println("메뉴 입력>");
		String menu = scn.nextLine();
		
		int result = CoffeeDAO.getInstance().salesCoffee(menu);

		if(result == 1) {
			System.out.println("판매량 완료");
		} else {
			System.out.println("판매량 실패");
		}
	}
	// 메뉴 삭제
	public void deleteCoffee() {
		System.out.println("삭제 메뉴>");
		String menu = scn.nextLine();
		
		int result = CoffeeDAO.getInstance().deleteCoffee(menu);
		
		if(result == 1) {
			System.out.println("메뉴 삭제 완료");
		} else {
			System.out.println("메뉴 삭제 실패");
		}
	}
	// 매출
	public void calCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().allMenu(); // 메뉴, 가격, 판매량
		int sum = 0;
		for(int i =0; i<list.size(); i++) {

			System.out.println("메뉴 : " + list.get(i).getCoffeeMenu()	+ ", 판매량 : " + list.get(i).getCoffeeSales()
			+ ", 판매금액 : "+ list.get(i).getCoffeePrice()*list.get(i).getCoffeeSales());
				
			sum += (list.get(i).getCoffeePrice()*list.get(i).getCoffeeSales());
			
		} // end of for
		System.out.println("총 판매금액 : " + sum + "원 입니다.");
		
	}

}
