package co.edu.reference;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기 : 5, intAry.length
		// 위치 세번째 => 15 -> 30;
		
		intAry[2] = 30;
		
		// 배열의 순서 바꾸기. 임의로 temp에 저장 후 변경.
		int temp = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = temp;
		
		// 배열의 수의 합계.
		int sum = 0;
		for(int i =0; i < intAry.length; i++) {
			sum += intAry[i];
		} 
		System.out.println("합계: " + sum);
		
//		for (int i = 0; i < intAry.length; i++) {
//			if (intAry[i] % 2 == 0) {
//				System.out.println(intAry[i]);
//			}
//		}
		
		for (int i = 0; i < intAry.length; i++) {
			//if (i % 2 == 0) {
				System.out.println(intAry[i]);
			//}
		}

	}
}
