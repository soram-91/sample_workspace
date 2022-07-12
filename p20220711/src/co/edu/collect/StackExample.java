package co.edu.collect;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack</*String*/>(); // 생략하면 왼쪽 stack에 지정된 타입을 따라감.
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		String elem = stack.pop();  // 요소를 하나씩 꺼냄.
		System.out.println(elem);
	
		elem = stack.peek();  		// 요소를 가져옴. 제거x
		System.out.println(elem);
	
		elem = stack.pop();  
		System.out.println(elem);
	
		if (stack.isEmpty()) {
			System.out.println("스택에 더이상 요소가 없음.");
		}
	}
}
