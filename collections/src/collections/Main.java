package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Books book1 = new Books("Physics",123);
		Books book2 = new Books ("Maths",456);
		Set<Books> book = new HashSet();
		book.add(book1);
		book.add(book2);
		
		Library library1 = new Library ();
		library1.setLibraryName("Gandhi");
		library1.setLibraryAccessCardNo(13);
		library1.setBook(book); 
	
		System.out.println("Library name " + library1.getLibraryName());
		System.out.println("Library access card number " + library1.getLibraryAccessCardNo());
	
		for (Iterator iterator = book.iterator(); iterator.hasNext();) {
			Books books = (Books) iterator.next();
			System.out.println(books);
			
			
		}
	}
		
		

}
