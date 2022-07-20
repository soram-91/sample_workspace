package homework;

public class juliyFifttExample01 {

	public static void main(String[] args) {
			gugudan(1);
		
	}
	public static void gugudan(int dan) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9 ; j++) {
				System.out.printf("%d x %d = %d\t", i, j, (i*j));
			} System.out.println();
		}
		
	}

}
