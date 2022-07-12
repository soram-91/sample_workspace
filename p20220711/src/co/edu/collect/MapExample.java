package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 *  이름, 점수 => map 저장
 *  김민수, 80 / 황현익, 75 / 이현승, 88
 *  Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환.
 */

public class MapExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		// 출력결과:
		// 평균점수:
		// 최고점수: 88, 최고점수 학생의 이름: 이현승.
		Set<Entry<String, Integer>> students = map.entrySet();
		System.out.println("출력결과: " + students);
		int sum = 0;
		for (Entry<String, Integer> ent : students) {
			int score = ent.getValue();
			sum += score;

		}
		double avg = (double) sum / students.size();
		System.out.println("평균점수: " + avg);

		int max = 0;
		String maxName = null;
		for (Entry<String, Integer> ent : students) {
			if (ent.getValue() > max) {
				max = ent.getValue();
				maxName = ent.getKey();
				
				}
		}
		System.out.println("최고점수: " + max + " 최고점수 학생의 이름: " + maxName);

		// 학생이름으로 검색.
//		System.out.println("이름을 입력하세요>> ");
		String name = scn.nextLine();

		Set<Entry<String, Integer>> set = map.entrySet();

//		for (Entry<String, Integer> ent : set) {
//			if (ent.getKey().equals(name)) {
//				System.out.println(name + "의 점수 : " + ent.getValue());
//			}
//		}

	}

}
