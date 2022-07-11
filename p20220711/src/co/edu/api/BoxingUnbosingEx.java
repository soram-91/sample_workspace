package co.edu.api;

import java.util.HashSet;

public class BoxingUnbosingEx {
	public static void main(String[] args) {
		// 로또번호 생성. 1 ~ 45
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			
			for (int j =0; j<i; j++) { // 현재 값과 동일한 값이 있는지 체크. 반복문, 조건문써서 중복된값 체크
				// code HERE.
				if(lotto[i] == temp) {
					
				}
			}
		}

//		for (int num : lotto) {
//			System.out.println(num);
//		}

		HashSet<Integer> set = new HashSet<Integer>();

		int cnt = set.size(); // 1,2,3,3 => 3 (중복포함x) 컬렉션에 들어있는 갯수
		while (cnt < 6) {
			int temp = (int)(Math.random() * 45) + 1;
			set.add(temp);		// 중복된 값은 허용안함.
			cnt = set.size();
			System.out.println(temp + "," + set.size());
		}
	}
}
