package homework;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

/*		System.out.print("첫번째 수: ");
		String strNum1 = scn.nextLine();

		System.out.print("두번째 수:");
		String strNum2 = scn.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(result); */
		
		System.out.println("[필수 정보 입력]");
		String name = scn.nextLine();
		String reNum = scn.nextLine();
		String phoneNum = scn.nextLine();
		System.out.printf("1. 이름: %s \n",name);
		System.out.printf("2. 주민번호 앞 6자리: %s \n", reNum);
		System.out.println("3. 전화번호: " + phoneNum);
	}

}
