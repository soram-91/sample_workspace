package co.edu;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 수:");
		String strNum1 = scn.nextLine();
		
		System.out.println("두번째 수:");
		String strNum2 = scn.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

}
