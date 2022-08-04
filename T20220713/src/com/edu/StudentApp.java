package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);
	
	public void execute() {
		System.out.println("1.등록 2.수정 3.리스트 9.종료");
		System.out.println("선택> ");
		int selectNo = Integer.parseInt(scn.next());
		if(selectNo == 1) {
			System.out.println("학생이름을 입력하세요");
			String StudName = scn.nextLine();
			System.out.println("번호를 입력하세요");
			int no =Integer.parseInt(scn.nextLine());
			
		}
		
		
		
	}
	
	public void addStudent() {
		
	}
	
	public void modStudent() {
		
	}
	public void studentList() {
		
	}
}
