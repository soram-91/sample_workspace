package com.edu;

public class SoccerMember extends Member{
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	String stName;
	String lockerName;
	
	
	public String getStName() {
		return stName;
	}


	public void setStName(String stName) {
		this.stName = stName;
	}


	public String getLockerName() {
		return lockerName;
	}


	public void setLockerName(String lockerName) {
		this.lockerName = lockerName;
	}


	@Override
	public String toString() {
		return "SoccerMember [코치이름: " + stName + ", 락커룸: " + lockerName + "]";
	}
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
}
