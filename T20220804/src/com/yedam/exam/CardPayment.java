package com.yedam.exam;

public class CardPayment implements Payment {
	/*- 필드로 카드할인율(cardRatio)을 가진다.
	- 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.*/

	// 필드
	public double cardRatio;
	
	// 생성자 | 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다.
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	
	// 메소드
	
	@Override
	public int online(int price) {
		// 카드결제에 대한 할인율 cardRatio
		// 온라인 결제 할인율 ONLINE_PAYMENT_RATIO
		// 간편 결제 할인율 + 온라인 결제 할인율 = ?
		// price 금액에 해서 할인율 적용하고, 거기에 대한 가격을 표시
		// price, price 할인율
		// 원가 - (원가*할인율) = 할인 후 금액
		// price - (price * (cardRatio + ONLINE_PAYMENT_RATIO)
		int pay = (int)(price-(price * (cardRatio + Payment.ONLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public int offline(int price) {// 카드결제에 대한 할인율 cardRatio
		// 온라인 결제 할인율 ONLINE_PAYMENT_RATIO
		// 간편 결제 할인율 + 온라인 결제 할인율 = ?
		// price 금액에 해서 할인율 적용하고, 거기에 대한 가격을 표시
		// price, price 할인율
		// 원가 - (원가*할인율) = 할인 후 금액
		// price - (price * (cardRatio + ONLINE_PAYMENT_RATIO)
		int pay = (int)(price-(price * (cardRatio + Payment.OFFLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (cardRatio + Payment.ONLINE_PAYMENT_RATIO));
		// String이 하나라도 있으면 다른것도 문자열으로 인식하므로 ()를 해주어 연산 먼저 한 후에 문자열 인식.
		System.out.println("오프라인 결제시 총 할인율 : " + (cardRatio + Payment.OFFLINE_PAYMENT_RATIO));
	}

}
