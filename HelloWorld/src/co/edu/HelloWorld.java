package co.edu;

public class HelloWorld {
	public static void main(String[] args) {
		// 변수의 종류 : int(정수), double(실수), boolean(논리), String(문자열)
		// int(4byte) < double(8byte)
		// 정수: byte(1byte) < short(2byte) < int(4byte) < long(8byte)
		String name = "도소람";
		// my_age 두문자의 조합 두번째문자 첫번째 글자는 대문자로 구분
		int myAge = 20; // 선언하면서 값을 할당 => 초기화.
		int yourAge; // 선언 : 초기화(x)
		yourAge = 22;
		double height = 162.4;
		boolean isMarried = true;
		String myAddress = "대구시";
		
		myAge = 30;
		height = 165.2;
		
		int result = myAge + yourAge; // 변수는 사용을 위해서 값이 할당되어 있어야 함.
		double result1 = (double) myAge + height;
		System.out.println(result);
		
		System.out.println("안녕하세요 " + name + " 입니다.");
	}

}
