package co.edu.reference;

public class MethodExample01 {
	public static void main(String[] args) {
		// 실행구문.
//		long sum = sum(20); // arguments (매개 값) 매개 값과 매개변수의 타입은 같아야함.
//		showInfo("홍길동", 20);
//		showInfo("도소람", 25);
//		printStar(27, "♬");
//		printStar(4, "♣");
/*		for (int i = 2; i <= 5; i++)
			printGugudan(i); */
		gugudan(1);

	}

// ♣
// ♣♣
// ♣♣♣
// ♣♣♣♣

	// 2 x 1 = 2  3 x 1 = 3  4 x 1 = 4
	// 2 x 2 = 2  3 x 2 = 6  4 x 2 = 8
	
	public static void gugudan(int dan) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.printf("%d x %d = %d\t", i, j, (i*j));
			} System.out.println();
		}
		
	}
	
	public static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}
	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);

			}
			System.out.println();

		}

	}

	public static void showInfo(String name, int age) { // 타입이 중요, void 는 return이 없음.
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
	}

	// method의 정의구문.
	public static long sum(int num) { // parameter (매개변수)
		int result = num * 2;
		return result; // 자동형변환(promotion)
	}
}
