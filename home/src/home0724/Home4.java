package home0724;

public class Home4 {
	public static void main(String[] args) {
		// ex3) 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		for (a = 1; a <= 6; a++) {
			for (b = 1; b <= 6; b++) {
				if (a + b == 6) {
					System.out.print(a + ", " + b);
					System.out.println();
				}
			}
		} // end of for

		// ex5) 방적식 2x+4y = 10의 모든 해를 구하시오.
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if(2*x + 4*y == 10) {
				System.out.println("x: " + x + ",y: " + y);
				}
			}
		} System.out.println();

	}
}
