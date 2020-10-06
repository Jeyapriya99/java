package com.day_3;

public class Books {
	private String bookName;
	private int bookNumber;
	public Books() {
		super();
	
	}
	public Books(String bookName, int bookNumber) {
		super();
		this.bookName = bookName;
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

}
