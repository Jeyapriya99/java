package day_7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


 

public class JavaStreamMinMax {

	public static void main(String[] args) {
		 List <Person> persons = new ArrayList <Person> ();
		 
	        persons.add(new Person(1, "Divya", 24));
	        persons.add(new Person(2, "Mahesh", 22));
	        persons.add(new Person(3, "Dinesh", 32));
	        persons.add(new Person(4, "Vinay", 25));
	        persons.add(new Person(5, "Kapil", 29));
	        persons.add(new Person(6, "Pallavi", 23));
	        persons.add(new Person(7, "Mayuri", 21));
	        persons.add(new Person(8, "Yashwant",30));
	        persons.add(new Person(9, "Vinayak", 46));
	        persons.add(new Person(9, "Vijay", 75));
	 
	        
	        Comparator <Person> comparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
	 
	        
	        Person youngest = persons.stream().min(comparator).get();
	        System.out.println("Youngest Person:- " + youngest);
	 
	        
	        Person oldest = persons.stream().max(comparator).get();
	        System.out.println("Oldest Person:- " + oldest);
	 

	}


}
