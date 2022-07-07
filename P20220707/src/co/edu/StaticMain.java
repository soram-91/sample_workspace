package co.edu;

/*
 *  static 정적메소드, 정적필드 사용.
 */

public class StaticMain {
	public static void main(String[] args) {
		// 정적 (static) 기능
		
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10, 20);
				
//		Math.random(); // Math class의 random method 호출.
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
		
		
	}
}
