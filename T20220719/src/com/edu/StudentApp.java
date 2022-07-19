package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);
	
	public void execute() {
		
		int selectNo;
		boolean run = true;
		while(run) {
			System.out.println("1.등록 2.수정 3.리스트 9.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			switch(selectNo) {
			case 1: 
				System.out.println("학생이름을 입력하세요");
				String name = scn.nextLine();
		
				System.out.println("번호를 입력하세요");
				String no =scn.nextLine();
			
				System.out.println("점수를 입력하세요");
				int score = Integer.parseInt(scn.nextLine());
				
				System.out.println("1.고등학생 2. 대학생");
				System.out.println("선택> ");
				selectNo = Integer.parseInt(scn.nextLine());
				
				if(selectNo == 1) {
//					고등학생정보 : 담임교사, 학년 정보 추가.
					System.out.println("고등학교 담임교사 이름을 입력하세요");
					String hiTName = scn.nextLine();
					
					System.out.println("학년 정보를 입력하세요");
					String hiGrade = scn.nextLine();
					
					addStudent(new HighStudent(name, no, score, hiTName, hiGrade));
				} else if (selectNo == 2) {
//					대학생정보 : 담당교수, 전공과목 정보 추가.
					System.out.println("담당교수 이름을 입력하세요");
					String prof = scn.nextLine();
					System.out.println("전공과목 정보를 입력하세요");
					String mClass = scn.nextLine();
					
					addStudent(new CollegeStudent(name, no, score, prof, mClass));
				}
				break;
			case 2 : 
				System.out.println("수정할 학생번호를 입력하세요.");
				String modNo = scn.nextLine();
				System.out.println("수정할 점수를 입력하세요.");
				int modScore =Integer.parseInt(scn.nextLine());
				
				modStudent(new Student(modNo,null,modScore));
				break;
			case 3 :
				studentList();
				break;
			case 9 : 
				System.out.println("프로그램 종료.");
				run = false;
			
			} // end of switch
		} 
	}
	
	public void addStudent(Student student) {
		list.add(student);
	}
	
	public void modStudent(Student student) {
		for(int i =0; i<list.size(); i++) {
			if(student.getStudNo()== list.get(i).getStudNo()) {
				list.get(i).setScore(student.getScore());
			}
		}
	}
	public void studentList() {
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
