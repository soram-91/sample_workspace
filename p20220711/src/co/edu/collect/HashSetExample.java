package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  Set (인터페이스) => HastSet, TreeSet
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기");
		System.out.println("크기: " + set.size());
		
		set.remove("딸기");
		System.out.println(set.contains("딸기"));
		
		if(set.isEmpty()) {
			System.out.println("컬렉션이 비어있음");
		} 
		
		// 반복요소처리.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}

		// 반복처리.
		iter = set.iterator();		// 새롭게 반복하고 싶으면 반복자를 획득해야함.
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		// 확장 for (요소타입 변수명 : 확장대상)
		for(String val : set) {
			System.out.println(val);
		}
	}
}
