package com.yedam.exam;

public interface Payment {

	// 상수필드
	
	/* 1) 온라인 결제 할인율 (ONLINE_PAYMENT_RATIO), 5% 
	 * 2) 오프라인 결제 할인율 (OFFLINE_PAYMENT_RATIO), 3%*/
	 
	// 온라인 결제 할인율
	public static final double ONLINE_PAYMENT_RATIO = 0.05;
	
	// 오프라인 결제 할인율
	public static final double OFFLINE_PAYMENT_RATIO = 0.03;
	
	// 추상 메소드
	// 1) 온라인 결제 메서드 시그니처
	// public abstract int online(int price); // 인터페이스에서는 추상화메소드[abstract] 생략가능
	public int online(int price);
	// 2) 오프라인 결제 메서드 시그니처
	public int offline(int price);
	// 3) 결제 정보 출력 메서드 시그니처
	public void showInfo();
}
