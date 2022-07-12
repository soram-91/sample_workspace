package co.edu.collect.board;
/*
 *  글제목, 작성자, 내용.
 */
public class Board {
	private String title;
	private String writer;
	private String content;
	
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}


	public String getTitle() {
		return title;
	}


	public String getWriter() {
		return writer;
	}


	public String getContent() {
		return content;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	

}
