package co.edu;

public class Example02 {
	public static void main(String[] args) {
		// 나의 키:변수, 친구 키:변수.
		
		// 나의 키가 더 큽니다.
		// 나의 키가 더 작습니다.
	double myHeight = 165.3;
	double friendHeight = 149.5;
	
	myHeight = 165.7;
	friendHeight = 177.2;
	
	double theDifference = 0;
	
	if(myHeight > friendHeight) {
		// 나의 키가 더 큽니다.
		theDifference = myHeight - friendHeight;
		System.out.println("나의 키가 " + theDifference + "만큼 더 큽니다.");
	} else {
		// 나의 키가 더 작습니다.
		theDifference = friendHeight - myHeight;
		System.out.println("나의 키가 " + theDifference + "만큼 더 작습니다.");
	}
	
	}

}
