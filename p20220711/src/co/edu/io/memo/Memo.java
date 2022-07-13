package co.edu.io.memo;

import java.io.Serializable;

/*
 *  메모번호, 날짜시간, 메모내용
 */
public class Memo implements Serializable{		// Serializable 직렬화
	private int no;
	private String date;
	private String content;
	
	// 생성자
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}

	// 기본 생성자
	public Memo() { }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo 번호: " + no + ", 날짜: " + date + ", 메모 내용: " + content + "]";
	}
	
		
	
}
