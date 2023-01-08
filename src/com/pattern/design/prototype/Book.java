package com.pattern.design.prototype;

public class Book {
	
	private int bookId;
	private String bookName;
	private int bookRatings;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookRatings() {
		return bookRatings;
	}

	public void setBookRatings(int bookRatings) {
		this.bookRatings = bookRatings;
	}

	public Book(int bookId, String bookName, int bookRatings) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookRatings = bookRatings;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookRatings=" + bookRatings + "]";
	}


}
