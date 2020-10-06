package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(22);// autoboxing - set.add(new Integer (22))
		set.add(12.34f);
		set.add("hello");
		set.add('j');
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object value = (Object) iterator.next();
			System.out.println(value);
			
		}
		

	}

}
