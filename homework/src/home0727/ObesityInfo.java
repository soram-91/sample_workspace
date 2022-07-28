package home0727;

public class ObesityInfo extends StandardWeightInfo{
	
	public ObesityInfo (String name, double height, double weight) {
		super(name, height, weight);
		
	}
	//이름, 키, 몸무게와 비만도를 출력하는 기능
	public void getInformation() {
		

		// 표준체중을 구하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
		//비만도를 구하는 기능 ( * 비만도 : (Weight - (Height - 100) * 0.9)/(Height - 100) * 0.9 * 100 )
		
		String obesity1 = null; 
		if (getObesity() >= 30) {
			obesity1 = "비만";
		} else if (getObesity() >= 20 && getObesity() <24){
			obesity1 = "정상체중";
		} else if(getObesity() < 20) {
			obesity1 = "저체중";
		}
		System.out.printf("%s님의 신장 %.0f, 몸무게%.0f, %s입니다.\n",name,height,weight,obesity1);
	}
	//비만도를 구하는 기능 ( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double getObesity() {
		double obesity = (weight - (height - 100) * 0.9)/((height - 100) * 0.9) * 100 ;
		
		return obesity;
	}
}
