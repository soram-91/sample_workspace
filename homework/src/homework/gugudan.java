package homework;

public class gugudan {
	public static void main(String[] args) {

		// 구구단.

		System.out.println("*** 구구단 ***");
/*		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", j, i, (j * i));
			} System.out.println();
		} */
		
		for(int i =1; i<=9 ; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, (j * i));
			} System.out.println();
		}
	}

}
