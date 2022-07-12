package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // <String> -> 제너릭
//		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("100");
//		list.add(100); // The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)

		for (int i = 0; i < list.size(); i++) {
			String result =list.get(i);
			System.out.println(result);
		}
		
		// List 컬렉션. List (인터페이스) => ArrayList, LinkedList,Vector
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1);  // 값을 읽어올 때.
		sList.remove(0);  // 값을 삭제.
		sList.set(0, "황길동");
				
		Iterator<String> iter = sList.iterator(); // 반복자 생성.
		while(iter.hasNext()) {			// 요소의 존재여부를 체크 : hasNext
			String val = iter.next();  // 요소를 가지고 오는 메소드. next
			System.out.println(val);
		}
		
		// index 기반으로 요소를 저장.
		for(int i =0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		// 확장 for 구문.
		for(String val : sList) {
			System.out.println(val);
		}
	}
}
