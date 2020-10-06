package com.day_3;
public class HasARelationship {

	public static void main(String[] args) {
		Books book = new Books("Physics",123);
		
		Library library1 = new Library ();
		library1.setLibraryName("Gandhi");
		library1.setLibraryAccessCardNo(13);
		library1.setBook(book);
		
		System.out.println("Libray Name :" + library1.getLibraryName());
		System.out.println("Libray Access Number :" + library1.getLibraryAccessCardNo());
		Books dummyBook = library1.getBook();
		System.out.println("Book name :" + dummyBook.getBookName());
		System.out.println("Book Number :" + dummyBook.getBookNumber());
			

	}

}
