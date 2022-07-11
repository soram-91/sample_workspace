package co.edu;

public class MorningEx2 {
	public static void main(String[] args) {
		// 정수(int) 배열(6개) => intAry.
		// 1 ~ 100까지 임의 값.

		int[] intAry = new int[6];

		// 최대.
		int max = intAry[0];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 100) + 1;
			sum += intAry[i];
			if(max < intAry[i]) {
				max = intAry[i];
			}
		}
		avg = (double) sum / intAry.length;
		System.out.println("avg:" + avg);

		// 확장 for
		for (int num : intAry) {
			System.out.println(num);
		}

	}
}
