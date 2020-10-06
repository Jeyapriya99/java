package com.day_3;


public class Library {
	private  String libraryName;
	private int libraryAccessCardNo;
	private Books book;
	public Library() {
		super();
	

	}
	public Library(String libraryName, int libraryAccessCardNo) {
		super();
		this.libraryName = libraryName;
		this.libraryAccessCardNo = libraryAccessCardNo;
	}
	
	
	
	public Books getBook() {
		return book;
	}
	public void setBook( Books book) {
		this.book = book;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public int getLibraryAccessCardNo() {
		return libraryAccessCardNo;
	}
	public void setLibraryAccessCardNo(int libraryAccessCardNo) {
		this.libraryAccessCardNo = libraryAccessCardNo;
	}
	
	
}


