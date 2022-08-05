package com.yedam.student;

import java.util.Scanner;

public class StudentService {
//	- 학생 등록
//	-> 학생 정보에 대한 입력
//	-> insert 데이터 입력
//
//	- 학생 성적 입력
//	-> 학생 ID 입력 후 존재하면 성적 입력
//
//	- 학생 정보 수정
//	-> 1. 이름 변경
//	-> 2. 주소 변경
//	-> 3. 전화번호 변경
//
//	- 학생 정보 조회
//	-> ID로 조회

	// 1. 학생등록
	
	Scanner sc = new Scanner(System.in);
	
	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);

		if (result == 1) {
			System.out.println("학생 정보 입력 성공");
		} else {
			System.out.println("학생 정보 입력 실패");
		}
	}
	
	// 2. 학생 성적 입력
	public void insertSubject(StudentDTO std) {
		// 1. 성적 입력 -> 1.국어 2.영어 3.수학
		int menu = 0;
		System.out.println("==========성적입력==========");
		System.out.println("1.국어 2.영어 3.수학");
		System.out.println("입력>");
		menu = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력>");
		
		if (menu == 1) {
			// 국어 점수 입력
			int kor = Integer.parseInt(sc.nextLine());
			std.setStudentKor(kor);
			
			checkResult(StudentManage.getInstance().updateKor(std));
			
		} else if (menu == 2) {
			// 영어 점수 입력
			int eng = Integer.parseInt(sc.nextLine());
			std.setStudentEng(eng);
			
			int result = StudentManage.getInstance().updateEng(std);
			checkResult(result);
			
		} else if (menu == 3) {
			// 수학 입력
			int math = Integer.parseInt(sc.nextLine());
			std.setStudentMath(math);
			
			checkResult(StudentManage.getInstance().updateMath(std));
		}
	}
	
	// 학생 정보 수정 (전화번호)
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		System.out.println("ID 입력>");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("변경할 전화번호 입력>");
		String tel = sc.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
	}
	
	// 학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {
		
		// StudentDTO std = StudentManage.getInstance().getStudent(id);
		// return std;
		return StudentManage.getInstance().getStudent(std.getStudentId());
	}
	
	// 성공 여부 확인
	private void checkResult(int value) {
		if(value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}
