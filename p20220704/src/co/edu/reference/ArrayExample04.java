package co.edu.reference;

public class ArrayExample04 {
	public static void main(String[] args) {
		// A반 80, 85, 83 
		// B반 79, 84, 90
		int[][] banAry = new int[2][3];

		// int[][] banAry = {{80,85,83},{79,84,90}};
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90; 
		
		int sum1 = 0;
		int sum2 = 0;

		// A반 평균.
		System.out.println(banAry[0]); // banAry[0] 의 값
		System.out.println(banAry[0][0]);
		
		for (int i = 0; i < banAry[0].length; i++) {
			sum1 += banAry[0][i];
		} 
		double avg1 = (double) sum1 / banAry[0].length;
		System.out.printf("A반의 평균: %.1f\n", avg1);

		// B반 평균.
		for (int i = 0; i < banAry[1].length; i++) {
			sum2 += banAry[1][i];
		}
		double avg2 = (double) sum2 / banAry[1].length;
		System.out.printf("B반의 평균: %.1f", avg2);
		
		
		
		
		

	}
}
