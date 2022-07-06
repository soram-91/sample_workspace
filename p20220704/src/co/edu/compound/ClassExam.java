package co.edu.compound;

public class ClassExam {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 25;

		String[] names = { "홍길동", "박민수", "김익수" };
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 19 };

		Student s1 = new Student(); // 초기화.
		s1.name = "홍길동";
		s1.score = 80;
		s1.age = 19;
		s1.height = 180.5;

		Student s2 = new Student();
		s2.name = "박민수";
		s2.score = 85;
		s2.age = 20;
		s2.height = 178.2;

		Student s3 = new Student();
//		System.out.println(s3.name);
//		System.out.println(s3.age);
		s3.name = "김익수";
		s3.score = 79;
		s3.age = 19;
		s3.height = 168.5;

		Student[] students = { s1, s2, s3 };

//		for (int i = 0; i < students.length; i++) {
//			System.out.print(students[i].name); // students[i]의 속성중에 name을 출력하겠습니다.
//			if (students[i].name.equals("김익수")) {
//				System.out.println("나이: " + students[i].age);
//			}
//		}
		
		//
		Car c1 = new Car("소나타", 220, 30, 20000000 ); // 힙메모리에 인스턴스 생성. c1:참조변수
//		c1.model = "소나타";
//		c1.price = 20000000;
//		c1.speed = 30;
		System.out.println(c1.model + "의 가격은 "+ c1.price +"입니다.");
		System.out.println("최고속도: "+c1.maxSpeed);
//		c1.setSpeed(50); // method.
		c1.start();
		c1.run();
		c1.showSpeed();
		c1.stop();		
		
				
//		Car c2 = new Car(); // 힙메모리에 인스턴스 생성. 
//		c2.model = "K5";
//		c2.price = 22000000;
//		c2.speed = 40;
//		c2.start();
//		c2.run();
//		c2.stop();
//		c2.showSpeed();
//		System.out.println(c1);
		
		Friend f1 = new Friend();
		
	}
}
