package com.yedam.exam;

public class ExeApp {
	public static void main(String[] args) {
		
//		SimplePayment sp = new SimplePayment(0.05);
//		sp.showInfo();
		
		// 인터페이스는 객체를 생성할 수 없음.
		// 다형성 (동일한 부모에게서라도 같은기능을 하지만 내용은 달라지는 것을 오버라이딩을 통해서 여러개(자식) 만들수 있음)
//		Payment simplePay = new SimplePayment(0.05);
//		
//		int online = simplePay.online(10000);
//		int offline = simplePay.offline(10000);
//		
//		simplePay.showInfo();
//		System.out.println("온라인 결제 금액 : " + online);
//		System.out.println("오프라인 결제 금액 : " + offline);
//		
//		System.out.println();
//		
//		Payment cardPay = new CardPayment(0.09);
//		
//		int onlineCard = cardPay.online(25000);
//		int offlineCard = cardPay.offline(55000);
//		
//		cardPay.showInfo();
//		System.out.println("온라인 결제 금액 : " + onlineCard);
//		System.out.println("오프라인 결제 금액 : " + offlineCard);
		
		new MapApp();
	}
}
