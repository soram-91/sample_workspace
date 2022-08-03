package com.yedam.string;

import java.util.Scanner;

public class StringEx1 {
// String API
// 6자리 -> 7자리 -> Scanner 데이터(000000 - 1234567)
// -> 나이, 성별을 구하시오.
// -> 991212 -> 1924~2023
// -> 981212-1578987
//	-> 010228-4785475
//	-> 000815-3857432

	// 1) 금년 기준으로 100년이 넘어 간 경우는 제외한다. (220509 -> 1922년 5월 9일 x)
	// <실행결과> 나이결과 입력한 생년월일 : 000510, 나이 :21 (현재년도 - 태어난년도)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = 0;
		System.out.println("주민등록번호를 입력하세요");
		String rrn = new String(scn.nextLine());
		int year =Integer.parseInt(rrn.substring(0, 2)); // 99 -> 1999 / 00 -> 2000
		if(year<=99) {
			year = 1900 + year;
			age = 2022 - year;
		} else  {
			year = 2000 + year;
			age = 2022 - year;
		}
		System.out.println("생년월일 : " +rrn.substring(0, 6) +", 나이: " + age);
		
		
	}

}
