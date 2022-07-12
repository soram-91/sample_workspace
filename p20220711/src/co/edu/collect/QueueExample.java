package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue <String> que = new LinkedList<>();
		
		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");
		
//		String result = que.poll();
//		System.out.println(result);
		
		while(!que.isEmpty()) {
			String result1 = que.poll();
			System.out.println(result1);
		}
		
	}
}
