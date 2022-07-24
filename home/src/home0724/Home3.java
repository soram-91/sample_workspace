package home0724;

public class Home3 {
	public static void main(String[] args) {

		// 다음의 for 문을 while 문으로 변경하시오.
//		for (int dan = 2; dan < 10; dan++) {
//			for (int gob = 1; gob < 10; gob++) {
//				System.out.println(dan + " * " + gob + " = " + dan * gob);
//			}
//		} // 
		int dan = 2;
		while (dan < 10) {
			int gob = 1;
			while (gob < 10) {
				System.out.println(dan + " * " + gob + " = " + dan * gob);
				gob++;
			}
			dan++;
		}
	}
}
