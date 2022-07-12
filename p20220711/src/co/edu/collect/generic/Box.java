package co.edu.collect.generic;
/*
 *  제네릭 : 타입을 클래스 정의하는 시점이 아니라 나중에 정하게씁니다.
 */

public class Box<T> {	  // generic(제네릭) <T> 정하는 시점에 정하겠습니다.(=나중에 정하겠습니다. / 아무거나 대문자 대입가능하지만 대체적으로 T사용)
	private T obj;   // Object는 제일 상위클래스, 모든것을 갖고올수있음.
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}
