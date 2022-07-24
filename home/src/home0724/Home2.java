package home0724;

public class Home2 {
	public static void main(String[] args) {

		boolean result = true;
		// (2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식
		char a = ' ';
		if (a != ' ' && a != '\t') {
			result = true;
			System.out.println(result);
		} else {
			result = false;
			System.out.println(result);
		}

		// (3) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		char ch = 'x';
		if (ch == 'x' || ch == 'X') {
			result = true;
			System.out.println(result);
		} else {
			result = false;
			System.out.println(result);
		}

	}
}
