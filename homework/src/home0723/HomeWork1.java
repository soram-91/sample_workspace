package home0723;

public class HomeWork1 {
	public static void main(String[] args) {
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		int result1 = arr1[5];
		System.out.println(result1);

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		int result2;
		for (int i = 0; i < arr1.length - 1; i++) {
			result2 = arr1[i];
			System.out.print(result2 + ", ");
		}
		System.out.println();

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		arr1[3] = 1000;
		int result3;
		for (int i = 0; i < arr1.length; i++) {
			result3 = arr1[i];
			System.out.print(result3 + ", ");
		}
		System.out.println();

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.print("최대값: " + max);
		System.out.println();
		
		int min = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.print("최소값: " + min);
		

	}
}
