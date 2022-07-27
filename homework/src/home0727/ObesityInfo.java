package home0727;

import java.util.Scanner;

public class ObesityInfo extends StandardWeightInfo{
	
	//이름, 키, 몸무게와 비만도를 출력하는 기능
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		double obesity = 0.0;
		System.out.println("이름을 입력하세요");
		name = scn.nextLine();
		System.out.println("키를 입력하세요");
		height = Double.parseDouble(scn.nextLine());
		System.out.println("몸무게를 입력하세요");
		weight = Double.parseDouble(scn.nextLine());
		// 표준체중을 구하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
		//비만도를 구하는 기능 ( * 비만도 : (Weight - (Height - 100) * 0.9)/(Height - 100) * 0.9 * 100 )
		obesity =  (weight - (height - 100) * 0.9)/(height - 100) * 0.9 * 100 ;
		String obesity1 = null; 
		if (obesity >= 30) {
			obesity1 = "비만입니다.";
		} else if (obesity >= 20 && obesity <24){
			obesity1 = "정상체중입니다.";
		} else if(obesity < 20) {
			obesity1 = "저체중입니다.";
		}
		System.out.print(name + "님의 신장 " + height + ", 몸무게 " + weight + ", " + obesity1);
	}
	//비만도를 구하는 기능 ( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	public double getObesity() {
		double obesity = 0.0;
		obesity = (weight - (height - 100) * 0.9)/(height - 100) * 0.9 * 100 ;
		
		return obesity;
	}
}
