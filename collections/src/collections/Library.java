package collections;

import java.util.Set;

public class Library {
	private  String libraryName;
	private int libraryAccessCardNo;
	private Set<Books> book;//has a relationship
	public Library() {
		super();
	

	}
	public Library(String libraryName, int libraryAccessCardNo) {
		super();
		this.libraryName = libraryName;
		this.libraryAccessCardNo = libraryAccessCardNo;
	}
	
	public Set<Books> getBook() {
		return book;
	}
	public void setBook(Set<Books> book) {
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
