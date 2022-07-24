package home0723;

public class HomeWork2 {
	public static void main(String[] args) {
		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] array = { 3, 7, 10, 12, 24, 31, 33, 37, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				int result = array[i];
				System.out.print(result+" ");
			}
		}

	}
}
