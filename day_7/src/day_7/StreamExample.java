package day_7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	      numbers.add(1);
	      numbers.add(2);
	      numbers.add(3);
	      numbers.add(4);
	      numbers.add(5);
	      numbers.add(6);

	      Stream<Integer> stream1 = numbers.stream();
	     
	      System.out.println("--------Stream elements after limiting----------");
	      stream1.limit(3).forEach((a) -> {
	         System.out.println(a);
	      });

	      Stream<Integer> stream2 = numbers.stream();
	     
	      System.out.println("--------Stream elements after skipping----------");
	      stream2.skip(2).forEach((a) -> {
	         System.out.println(a);
	      });
	   }

	}


