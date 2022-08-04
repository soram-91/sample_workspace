package com.yedam.exam;

import java.util.HashMap;
import java.util.Scanner;

public class MapApp {
//	1. 단어 등록 C
//	2. 사전 전체 조회 R
//	3. 단어 검색 R
//	4. 단어 수정 U
//	5. 단어 삭제 D

	HashMap<String, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	String menuNo = "";

	public MapApp() {
		run();
	}

	private void run() {
		// menuNo = "99"
		// menuNo.equals("99") -> true
		// !menuNo.equals("99") -> false
		// boolean a = true
		// !a = false
		while (!(menuNo.equals("99"))) {
			System.out.println("******************************************************************");
			System.out.println("1. 단어 등록  2. 사전 전체 조회  3. 단어 검색	  4. 단어 수정  5. 단어 삭제  99. 종료");
			System.out.println("******************************************************************");
			System.out.println("입력");
			menuNo = sc.nextLine();

			// 단어 등록
			if (menuNo.equals("1")) {
				String word = "";
				while (true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요.");
					System.out.println("입력>");
					word = sc.nextLine();
					if (word.equals("q")) {
						break;
					}
					System.out.println("단어의 의미를 입력하세요");
					System.out.println("입력>");
					String mean = sc.nextLine();
					map.put(word, mean);
				}

			}
			// 사전 전체 조회
			else if (menuNo.equals("2")) {
				if (map.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
				} else {
					System.out.println("**********예담 단어장**********");

					// 향상된 for문 이용해 key를 가져옴
					// 가져온 key를 활용하여 value를 가져옴
					for (String key : map.keySet()) { // 키 값을 입력해서 맵에 있는 키 값을 하나씩 가져오기.
						String value = map.get(key); // key값 입력하면 데이터 가져옴
						System.out.println("단어 : " + key + "\n 뜻 : " + value);
					}
				}
			}
			// 단어 검색
			else if (menuNo.equals("3")) {
				System.out.println("단어 입력>");
				String key = sc.nextLine();
				if (map.containsKey(key)) { // key가 맵에 있나없나 존재유무 확인
					String value = map.get(key);
					System.out.println("단어 : " + key + "\n 뜻 : " + value);
				} else {
					System.out.println("동록되지 않은 단어입니다.");
				}

			}
			// 단어 수정
			else if (menuNo.equals("4")) {
				System.out.println("수정 단어 입력>");
				String word = sc.nextLine();
				if (map.containsKey(word)) {
					System.out.println("수정할 뜻 입력>");
					String value = sc.nextLine();
					map.put(word, value); // Map 성질 : 중복된 값 입력 x -> 덮어씌워지므로 put() 사용
				} else {
					System.out.println("동록되지 않은 단어입니다.");
				}
			}
			// 단어 삭제
			else if (menuNo.equals("5")) {
				System.out.println("1. 1건 삭제  2. 전체 삭제");
				System.out.println("입력> ");
				String menu = sc.nextLine();
				
				// 1건 삭제
				if (menu.equals("1")) {
					System.out.println("삭제할 단어 입력>");
					String word = sc.nextLine();
					if (map.containsKey(word)) {
						map.remove(word);  // remove(key값) : key 삭제
						if(!map.containsKey(word)){
							System.out.println("삭제 완료");
						} else {
							System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
						}
					}
				}
				
				// 전체 삭제
				else if (menu.equals("2")) {
					map.clear();
					if(map.size()==0) {
						System.out.println("전체 삭제 완료");
					} else {
						System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
					}
				}

			}

		}
	}
}
