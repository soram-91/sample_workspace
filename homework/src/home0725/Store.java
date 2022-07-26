package home0725;

import java.util.Scanner;

public class Store {
	public int itemNo;
	public String name;
	public int price;
	String[] list = new String[10];
	int[] priceList = new int[10];

	Scanner scn = new Scanner(System.in);

	public Store() {

	}

	public Store(int itemNo) {
		this.itemNo = itemNo;
	}

	public Store(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void getName() {

		for (int i = 0; i < list.length; i++) {
			list[i] = name;
		}
		System.out.print("제품명은 " + name + "이고, ");

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getPrice() {
		for (int i = 0; i < priceList.length; i++) {
			priceList[i] = price;
		}
		System.out.print("가격은 " + price + "입니다\n");

	}

	public void maxPriceItem() {
		int max = 0;
		String maxPriceItem = null;
		for (int i = 0; i < priceList.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (priceList[i] > max) {
					max = priceList[i];
					maxPriceItem = list[j];
				}
			}
		}
		System.out.print("최고 가격 제품은 " + maxPriceItem + "이고, ");
	}

	public void sumPrice() {
		int sum = 0;
		int max = 0;
		int sumPrice = 0;
		for (int i = 0; i < priceList.length; i++) {
			if (priceList[i] > max) {
				max = priceList[i];
			}
			sum += priceList[i];
		}
		sumPrice = sum - max;
		System.out.print("나머지 물품의 합계는 : " + sumPrice + "입니다. \n");

	}

}
