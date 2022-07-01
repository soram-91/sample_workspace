package co.edu;

public class Example01 {

	public static void main(String[] args) {
		String myName = "도소람";
		double myHeight = 165.3;
		char c1 = 'a';
		int i1 = 'a';
		
		System.out.println("이름은 " + myName + " 이고, 키는 " + myHeight + "입니다.");
		System.out.println(c1);
		System.out.println(i1);
		
		char c2 = 'A';	
		for (int i=0; i<5; i++) {
		System.out.println(c2++);
		}
		
		
		boolean isTrue = false;
		
		int myAge = 13;
		int yourAge = 10;
		isTrue = myAge > yourAge;
		
		if (isTrue) {
			System.out.println("나의 나의가 더 많다.");
		}else {
			System.out.println("나의 나의가 더 적다.");
		}
		
		// float, double : double default.
		float f1 = 23.4f; // 4byte
		double d1 = 23.f; // 8byte
		
		// 0 ~ 20 정수.
		// 0 ~ 1 실수.
		double result = 1.1 + 2.2;
		System.out.println(result);
		
		// long(8byte) float(4byte);
		float sum = 2345L + 22.3F;
		}

}
