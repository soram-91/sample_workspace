package co.edu.collect.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		box.get();
//		Integer result = box.get(); // Type mismatch: cannot convert from String to Integer
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer (Boxing)
		intBox.get();		 
		int result1 = intBox.get();  // Integer => int (unboxing)
	}
}
