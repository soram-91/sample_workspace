package com.yedam.review;

public class StringAPI {
	public static void main(String[] args) {
		String a = "aaa";

		String b = "aaa"; // a,b는 같은 주소값

		String c = new String("aaa"); // a,b 와 c는 다른 주소값

		if (a == c) {
			System.out.println("주소값이 같다");
		} else {
			System.out.println("주소값이 다르다");
		}
		if (a.equals(c)) {
			System.out.println("데이터가 같다.");
		} else {
			System.out.println("데이터가 다르다");
		}

//		a == b
//		a == c

		// 100번지
		String a1 = "aaa";

		// "aaabbb" 101번지
		a1 = a1 + "bbb";
		
		StringBuilder sb = new StringBuilder();
		
		// 100번지
		sb.append("aaa"); // 추가
		// 100번지
		sb.append("bb");
	}

}
