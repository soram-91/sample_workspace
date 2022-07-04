package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {
		
		// 10번 반복.
		// num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// sum 변수 <= 2의 배수의 합.
		// 2의 배수의 합: 22?
		
		int num, sum2, sum3;
		sum2 = sum3 = 0;	
		
		for(int i=1; i <=10; i++) {
			
			num = (int) (Math.random() * 10) + 1;
			if(num %2 == 0) {  //2의 배수를 sum2에 누적.
				sum2 += num; // sum2 = sum2 + num;
			}
			
			if(num %3 == 0) { // 3의 배수를 sum3에 누적.
				sum3 += num;
			}
			
		}
		System.out.println("2 의 배수의 합: " + sum2);
		System.out.println("3 의 배수의 합: " + sum3);
	}
}
