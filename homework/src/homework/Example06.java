package homework;

public class Example06 {
	public static void main(String[] args) {
		int[] intAry = new int[6];

		/*
		 * for (int i =2; i <=9; i++) { System.out.println("*** " + i + " 단 ***"); for
		 * (int j = 1; j<=9; j++) { System.out.println(i + "x" + j +"="+(i*j)); }
		 * System.out.println(); }
		 */

		/*
		 * while (true) { int num1 = (int) (Math.random() * 6) + 1; int num2 = (int)
		 * (Math.random() * 6) + 1; System.out.println("(" + num1 + "," + num2 + ")");
		 * if ((num1 + num2) == 5) { break; }
		 */

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4*x + 5*y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		for(int i =1; i<=4 ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		for(int i = 1; i<=4; i++) {
			for(int j=4; j<0; j--) {
				for(int k =1; k<=i; k++) {
					System.out.print(" ");
				} System.out.print("*");
			}  System.out.println();
		} 

	}

}
