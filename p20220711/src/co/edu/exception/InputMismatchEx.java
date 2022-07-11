package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("숫자를 입력하세요.> ");
			int num = scn.nextInt(); // 사용자의 입력값이 정수가 아닌 문자열
			System.out.println("입력값 : " + num);
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력된 값입니다. 숫자를 입력하세요");
		}
		System.out.println("프로그램 종료.");

	}
}
