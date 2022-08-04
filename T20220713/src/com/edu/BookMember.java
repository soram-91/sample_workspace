package com.edu;

// Member 상속.
public class BookMember extends Member{
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String banName;
	private String className;
	
	
	
	
	public String getBanName() {
		return banName;
	}




	public void setBanName(String banName) {
		this.banName = banName;
	}




	public String getClassName() {
		return className;
	}




	public void setClassName(String className) {
		this.className = className;
	}




	@Override
	public String toString() {
		return "BookMember [반장이름: " + banName + ", 강의실: " + className + "]";
	}
		
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실   // toString 오버라이딩.
}
