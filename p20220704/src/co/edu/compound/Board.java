package co.edu.compound;

import java.util.Date;

/*
 *  게시글 한건의 정보.
 *  등록 / 조회/ 수정/ 삭제/ 리스트
 *  
 */
public class Board {
	// 필드.
	private String title;
	private String content;
	private String writer;
	private Date createDate;
	private int hitCount;

	
	// 생성자.

	
	// getter, setter
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public int getHitCount() {
		return hitCount;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	
	
	
	
}


	