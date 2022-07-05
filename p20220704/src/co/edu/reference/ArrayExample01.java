package co.edu.reference;

public class ArrayExample01 {
	public static void main(String[] args) {
		// 배열의 저장공간 선언.

		int[] intAry = new int[10]; // 저장공간이 10개인 객체. byte,short,lnt,long => 0
		intAry[0] = 10; // 첫번째 위치에 10값을 할당.
		intAry[4] = 50; // 다섯번째 위치에 50값을 할당.

//		System.out.println(intAry.length);
		/*
		 * for(int i=0; i<10; i++) { System.out.println(intAry[i]); }
		 */

		double[] dblAry = new double[5]; // double 형 공간 5개 선언. 초기값 0.0
		for (int i = 0; i < dblAry.length; i++) {
			System.out.println(dblAry[i]);
		}

		boolean[] boolAry = new boolean[3]; // boolean 형 공간 3개 선언. 초기값 false
		boolAry[1] = true;
//		boolAry[2] = "true"; // boolAry 에는 boolean 형 대입.
		for (int i = 0; i < boolAry.length; i++) {
			System.out.println(boolAry[i]);
		}

		String[] strAry = { "홍길동", "김민수", "허민기" }; // 3개의 값을 할당.
//		strAry[3]="황경영"; // 실행오류 발생. (할당된 값의 범위를 벗어남.)
		strAry[2]="황경영";
		
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}
}
