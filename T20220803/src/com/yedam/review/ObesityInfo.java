package com.yedam.review;

public class ObesityInfo extends StandardWeightInfo{
	// 생성자
	
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	// 메소드
	// 이름, 키, 몸무게와 비만도를 출력하는 기능
	@Override
	public void getInformation() {
		String obesityInfo = null;
		if(getObesity(weight,height) < 18.5) {
			obesityInfo = "저체중입니다.";
		} else if (getObesity(weight,height) > 18.5 && getObesity(weight,height) < 22.9) {
			obesityInfo = "정상체중입니다.";
		} else if (getObesity(weight,height) > 25) {
			obesityInfo = "비만입니다.";
		}
			
		System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, %s \n",name,height,weight,obesityInfo);
	}
	//표준 체중 : (Height - 100) * 0.9 
	//비만도를 구하는 기능 ( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
		public double getObesity(double weight, double height) {
			return (weight - getStandardWeight(height)) / getStandardWeight(height)*100;
		}
}
