package home0727;

import java.util.Scanner;

public class StandardWeightInfo extends Human {

	// 이름, 키, 몸무게와 표준체중을 출력하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
	@Override
	public void getInformation() {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scn.nextLine();
		System.out.println("키를 입력하세요");
		height = Double.parseDouble(scn.nextLine());
		System.out.println("몸무게를 입력하세요");
		weight = Double.parseDouble(scn.nextLine());
		double standardWeight = (height - 100) * 0.9;
		
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 표준체중 " + standardWeight + "입니다.");
	}
	
	// 표준체중을 구하는 기능 ( * 표준 체중 : (Height - 100) * 0.9 )
	public double getStandardWeight() {
		double standardWeight = 0.0;
		standardWeight = (height - 100) * 0.9;
		return standardWeight;
	}


}
