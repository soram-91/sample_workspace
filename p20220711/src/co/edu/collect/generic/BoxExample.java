package co.edu.collect.generic;

public class BoxExample {
	public static void main(String[] args) {
		Box strBox = new Box();
		strBox.set(new String("문자열"));  // 매개값 : Object
		String result = (String) strBox.get();
		System.out.println(result);
		
		Box intBox = new Box();
		intBox.set(new Integer(100));
		Integer result1 = (Integer) intBox.get();
		System.out.println(result1);
	}
}
