package homework;

public class Example07 {
	public static void main(String[] args) {

		/*
		 * while (true) { int num1 = (int) (Math.random() * 6) + 1; int num2 = (int)
		 * (Math.random() * 6) + 1;
		 * 
		 * if (num1 + num2 == 5) { System.out.println("(" + num1 + "," + num2 + ")");
		 * break; }
		 */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i; 
				
			}
		} System.out.println(sum);

	}
}
