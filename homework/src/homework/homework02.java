package homework;

public class homework02 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.printf("%d시간 %d분\n",hour,minute);
		int totalMin = (hour*60) + minute;
		System.out.printf("총 %d분\n",totalMin);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		int x = 5;
		int y =2;
		double result =(double) x / y;
		System.out.println(result);
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result1 = (int) (var1 + var2);
		System.out.println(result1);
		
	}
}
