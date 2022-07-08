package co.edu.emp;

import java.util.Calendar;

/*
 *  Calendar 클래스 연습.
 */
public class CalendarExample {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR)+"년");
//		System.out.println(cal.get(Calendar.MONTH)+1 +"월"); // 0(1월) ~ 11(12월)
//		System.out.println(cal.get(Calendar.DATE)+"일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); // 1(일) ~ 7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE)); // 말일 날짜.
		
		cal.set(2022, 5, 1); // 2022년 6월 1일 지정.
//		System.out.println(cal.get(Calendar.YEAR)+"년");
//		System.out.println(cal.get(Calendar.MONTH)+1 +"월"); // 0(1월) ~ 11(12월)
//		System.out.println(cal.get(Calendar.DATE)+"일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일"); // 1(일) ~ 7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE)); // 말일 날짜.
		cal.set(2022, 9, 1);
		
		CalendarExample cal1 = new CalendarExample();
		cal1.getLastDate(2022, 9);
		cal1.getDayInfo(2022, 9);
		
	}
	
	// 년, 월 정보 => 해당 년, 월의 말일정보(메소드) 2022년 9월 = 30일
	public int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		System.out.println(year+"년 "+month+"월의 말일은 " + cal.getActualMaximum(Calendar.DATE));
		return cal.getActualMaximum(Calendar.DATE);
		
	} 
	// 년, 월 정보 => 해당 년, 월의 1일의 정보(메소드)
	public int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		System.out.println(year+"년 "+month+"월의 1일은 " + cal.get(Calendar.DAY_OF_WEEK)+"요일");
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
}
