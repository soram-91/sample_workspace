package home0727;


public class StandardWeightInfo extends Human {
	
	public StandardWeightInfo (String name, double height, double weight) {
		super(name, height, weight);
	}
	
	// 이름, 키, 몸무게와 표준체중을 출력하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
	@Override
	public void getInformation() {

		System.out.printf("%s님의 신장 %.0f, 몸무게%.0f, 표준체중 %.1f 입니다.\n",name,height,weight,getStandardWeight());
	}
	
	// 표준체중을 구하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
	public double getStandardWeight() {
		double standardWeight = (height - 100) * 0.9;
		
		return standardWeight;
	}


}
