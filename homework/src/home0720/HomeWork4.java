package home0720;

public class HomeWork4 {
	public static void main(String[] args) {
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// *
		// **
		// ***
		// ****
		// *****
		for (int x = 1; x <= 5; x++) {
			for (int j = 1; j <= x; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
