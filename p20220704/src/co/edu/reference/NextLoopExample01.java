package co.edu.reference;

public class NextLoopExample01 {
	public static void main(String[] args) {

		for (int j = 1; j < 3; j++) {
//			System.out.println("j의 값: " + j);
			for (int i = 0; i < 5; i++) {
//				System.out.println("	i의 값: " + i);
			}
		}

		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) { // for 출력하고자 하는 것이 1개일경우 {} 생략가능
//				System.out.printf("%d * %d = %d\n", j, i, (j * i));
			}
//			System.out.println();
		}

		// *
		// **
		// ***
		// ****

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ---*
		// --**
		// -***
		// ****

		for (int i = 1; i <= 4; i++) {
			
			for (int k = 3; k >= i ; k--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		

			System.out.println();
			
		}
	}
}
