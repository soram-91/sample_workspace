package co.yedam;

import java.util.Scanner;

/*
 * 문제 3: 배열사용.
 * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
 * 저장 된 값중에서 가장 작은 값과 배열요소의 평균을 구하는 기능을 작성하세요.
 * 출력 예 : [5, 6, 7] 가장 작은 값: 5, 평균: 6.0
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] array = new int[3];
				
		int min = 100;
		int sum = 0;
				
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
			sum += array[i];
			if (array[i] < min) {
				min = array[i];
			} 
		}
		double avg = (double) sum / array.length;
		System.out.printf("가장 작은 값: %d, 평균: %.1f ",min, avg);


	}
}
