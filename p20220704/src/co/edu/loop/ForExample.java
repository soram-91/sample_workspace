package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 1) {
				sum = sum + i;
				System.out.println("i의 값: " + i + ", sum의 값: " + sum);
			}
		} 
		System.out.println("홀수 합: " + sum);
		
		// 1 ~ 10 까지 result => 누적.
		// 1, 3, 5, 7, 9 => 누적. +2
		// 1, 4, 7, 10 => 누적.  +3
		
		int result = 0;
		for(int i =1; i <= 10; i += 2) {
			if(i % 2 == 1) {
				result += i;
			}
			
			System.out.println("1 ~ 10 까지 누적 합 : " + result);
			
		// 1 ~ 10 까지 출력.
		
		for(int i1 = 1; i1 <= 10; i1++) {
			System.out.println(i1);
		}
		
		// 10 ~ 1 까지 출력
		
		for(int i2 = 10; i2 >= 10; i2--) {
			System.out.println(i2);
		}
		
		}
	}
}
