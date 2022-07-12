package co.edu.thread.synchronize;

public class MainThread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalulator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalulator(calculator);
		user2.start();
	}
}
