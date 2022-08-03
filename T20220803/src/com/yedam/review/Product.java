package com.yedam.review;

//클래스 타입의 배열
public class Product {
	
	// 필드
	private int price;
	private int amount; // 상품의 갯수
	private String name;
		
	// 생성자
	
	// 메소드 -> 필드값이 private이므로 getter, setter사용
	// getter, setter : 말도 안되는 값 방지.
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			price = 0;
		}
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		if(amount < 0) {
			amount = 0;
		}
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
