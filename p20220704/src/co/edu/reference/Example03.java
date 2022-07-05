package co.edu.reference;

public class Example03 {
	public static void main(String[] args) {
		// for 반복문을 활용. 구구단 3단을 출력.
		for (int i = 1; i <= 9; i++) {
			int result = 3 * i;
			System.out.println("3x" + i + "=" + result);
		}
		int max = 0;
		int[] ary = { 1, 5, 3, 8, 2 };
		
		for(int i =0; i < ary.length ; i++) {
			if(max < ary[i]) {
				max = ary[i];
			} 
		} System.out.println(max);
	}
}