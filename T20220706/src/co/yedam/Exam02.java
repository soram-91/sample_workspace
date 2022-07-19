package co.yedam;

import java.util.Scanner;

/*
 * 문제2 : 정수형 변수 num1, num2를 선언하고  Scanner 클래스를 이용하여 사용자의 입력값을 비교한 후 큰 수에서 작은 수를 나눈 결과값을
 * 소수점 첫번째 자리까지 구하는 기능을 구현하세요.
 * 출력 예: 15를 7로 나누면 14.1 입니다.
 */
public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		double scnNo1 = Double.parseDouble(scn.nextLine());
		double scnNo2 = Double.parseDouble(scn.nextLine());
		if (scnNo1 < scnNo2) {
			double result1 = (double)(scnNo2/scnNo1);
			System.out.printf("%.1f",result1);
		} else if (scnNo1 > scnNo2) {
			double result2 = (double)(scnNo1/scnNo2);
			System.out.printf("%.1f",result2);
		}

	}
}
